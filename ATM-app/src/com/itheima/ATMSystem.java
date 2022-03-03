package com.itheima;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author： Negoowen
 * @date： 2022-02-14
 * @project_name: java_learn_note
 */
public class ATMSystem {
    public static void main(String[] args) {
        // 1. 定義系統需要存儲的對象，用於存儲賬戶對象
        ArrayList<Account> accounts = new ArrayList<>();
        // 2. 準備系統的首頁, 登錄, 開戶
        showMain(accounts);

    }

    public static void showMain(ArrayList<Account> accounts) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("======欢迎您进入到ATM系统===============");
            System.out.println("1、登录账户");
            System.out.println("2、注册账户");
            System.out.println("请您选择操作：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    // Login
                    login(accounts,sc);
                    break;
                case 2:
                    // sign up
                    register(accounts,sc);
                    break;

                default:
                    System.out.println("您输入的命令有误！");

            }
        }
    }
    /**
     用户登录功能
     */
    private static void login(ArrayList<Account> accounts,Scanner sc) {
        //必须系统中存在账户才可以登录
        if(accounts.size() == 0 ){
            //没有任何账户
            System.out.println("当前系统中无任何账户，您需要先注册！");
            return; // 直接结束方法的执行
        }
        // 2、根据卡号去集合中查询是否存在账户对象
        while (true) {
            System.out.println("请您输入登录的卡号：");
            String cardId = sc.next();
            //根据卡号查询账户对象.
            Account acc = getAccountByCardId(cardId, accounts);
            //3.判断账户对象是否存在，存在说明卡号没问题
            if (acc != null) {
                //让用户继续输入密码
                System.out.println("请您输入登录的密码：");
                String password = sc.next();
                //5.判断密码是否正确
                if (acc.getPassWord().equals(password)) {
                    //密码正确，登录成功
                    //展示系统登录后的操作界面
                    System.out.println("恭喜您，" + acc.getUserName() + "先生/女士成功进入系统，您的卡号是：" + acc.getCardId());
                    showUserCommand(sc, acc, accounts);
                    return; //继续结束登录方法
                } else {
                    System.out.println("您的密码有误，请确认！");
                }
            } else {
                System.out.println("对不起，不存在该卡号的账户！");
            }
        }
    }

    private static void showUserCommand(Scanner sc, Account acc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("==========用户操作界面===============");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、修改密码");
            System.out.println("6、退出");
            System.out.println("7、注销账户");
            System.out.println("请您输入操作命令:");
            int command = sc.nextInt();
            switch (command) {
                case 1:
    //                查询
                    showAccount(acc);
                    break;
                case 2:
    //                存款
                    depositMoney(acc, sc);
                    break;
                case 3:
    //                取款
                    drawMoney(acc, sc);
                    break;
                case 4:
    //                转账
                    transferMoney(accounts, acc, sc);
                    break;
                case 5:
    //                修改密码
                    updatePassword(acc, sc);
                    return;
                case 6:
    //                退出
                    System.out.println("欢迎下次光临！！");
                    return;//结束当前操作的方法！！
                case 7:
                    //注销账户
                    //从当前集合中抹掉当前账户对象即可
                    accounts.remove(acc);
                    System.out.println("销户成功了！!");
                    return;//结束当前操作的方法！
                default:
                    System.out.println("您输入的命令有误~~~~");
            }
        }
    }

    private static void updatePassword(Account acc, Scanner sc) {
        System.out.println("==========修改密码===============");
        while (true) {
            System.out.println("请您输入正确的密码：");
            String okPassword = sc.next();
            //判断密码是否正确
            if (acc.getPassWord().equals(okPassword)) {
                //可以输入新密码
                while (true) {
                    System.out.println("请您输入新密码：");
                    String newPassword = sc.next();

                    System.out.println("请您输入确认密码：");
                    String okNewPassWord = sc.next();

                    if(newPassword.equals(okNewPassWord)){
                        //修改账户对象的密码为新密码
                        acc.setPassWord(newPassword);
                        return; // 直接结束掉！！
                    }else{
                        System.out.println("您两次输入的密码不一致~~~");
                    }
                }
            }else{
                System.out.println("您当前输入的密码不正确~~~");
            }
        }
    }


    /**
     * 转账功能
     * @param accounts
     * @param acc
     * @param sc
     */
    private static void transferMoney(ArrayList<Account> accounts, Account acc, Scanner sc) {
        //1.判断系统中是否有2个账户及以上
        if(accounts.size() < 2){
            System.out.println("对不起，系统中无其他账户，您不可以转账！");
            return;
        }

        //2.判断自己的账户对象中是否有钱
        if(acc.getMoney() == 0){
            System.out.println("对不起，您自己都没钱，就别转了~~");
            return;
        }

        //3.开始转账逻辑
        while (true) {
            System.out.println("请您输入对方账户卡号：");
            String cardId = sc.next();
            Account account = getAccountByCardId(cardId, accounts);
            // 判断这个账户对象是否存在，存在说明对方卡号输入正确
            if (account != null) {
                // 姓氏确认
                //判断这个账户对象是否是当前登录的账户自己
                if (account.getCardId().equals(acc.getCardId())) {
                    //正在给自己转账
                    System.out.println("您不可以为自己转账！");
                } else {
                    //确认对方的姓氏
                    String name = "*" + account.getUserName().substring(1);
                    System.out.print("请您确认[ " + name + " ] 的姓氏：");
                    String preName = sc.next();
                    //判断
                    if (account.getUserName().startsWith(preName)) {
                        //真正开始转账了
                        System.out.println("请您输入转账的金额:");
                        double money = sc.nextDouble();
                        //判断这个金额是否超过了自己的余额
                        if (money > acc.getMoney()) {
                            System.out.println("对不起，您要转账的金额太多，您最多可以转账多少：" + acc.getMoney());
                        } else {
                            //真的可以转了
                            acc.setMoney(acc.getMoney() - money);
                            account.setMoney(account.getMoney() + money);
                            System.out.println("恭喜您，转账成功了，已经为" + account.getUserName() + "转账多少：" + money);
                            showAccount(acc);
                            return;
                        }
                    } else {
                        System.out.println("对不起，您认证的信息有误~~~");
                    }
                }
                System.out.println("对不起，您输入的转账卡号有问题！");
            }
        }
    }

    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("========取款操作===========");
        //1.判断它的账户是否足够100元
        if (acc.getMoney() > 100) {
            while (true) {
                System.out.println("请您输入取款的金额：");
                double money = sc.nextDouble();
                //2.判断这个金额有没有超过当次限额
                if (money > acc.getQuotaMoney()) {
                    System.out.println("您当次取款金额超过每次取款限额，不要取那么多，每次最多可以取：" + acc.getQuotaMoney());
                } else {
                    //3.判断当前余额是否足够你取钱
                    if (money <= acc.getMoney()) {
                        //够钱，可以取钱了
                        acc.setMoney(acc.getMoney() - money);
                        System.out.println("恭喜您，取钱" + money + "成功了！当前账户还剩余：" + acc.getMoney());
                        return;//取钱后干掉取钱方法
                    }
                }
            }
        } else {
            System.out.println("您自己的金额没有超过100元，就别取了~~~");
        }
    }

    /*
    * 存款
    * */
    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("========存钱操作===========");
        System.out.println("请您输入存款金额：");
        double money = sc.nextDouble();

        //直接把金额修改到账户对象的money属性中去
        acc.setMoney(acc.getMoney() + money);
        System.out.println("存款完成！!");
        showAccount(acc);

    }

    private static void showAccount(Account acc) {
        System.out.println("============当前账户详情==============");
        System.out.println("卡号：" +  acc.getCardId());
        System.out.println("姓名：" +  acc.getUserName());
        System.out.println("余额: " +  acc.getMoney());
        System.out.println("当次限额：" + acc.getQuotaMoney());

    }

    /**
     * 用户开户功能
     *
     * @param accounts 账户集合对象
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("==============用户开户功能===================");
        //        键盘录入姓名，密码，去人密码
        System.out.println("请您输入账户名称：");
        String name =sc.next();
        String passWord = "";
        while (true) {
            System.out.println("请您输入账户密码：");
            passWord =sc.next();
            System.out.println("请您输入确认密码：");
            String okPassWord =sc.next();
            // 判断两次密码是否一致
            if (okPassWord.equals(passWord)) {
                // 密码无问题
                break;

            } else {
                System.out.println("两次输入的密码不一致！");
            }
        }
        System.out.println("请您输入转取款限额：");
        double quotaMoney =sc.nextDouble();
        System.out.println(passWord);
        // 关键点：为当前账户生成一个随机的8位数字作为卡号，卡号不能与其他用户的卡号重复。
        String cardId = createCardID(accounts);
        //4.创建一个账户对象封装账户的信息
        Account account = new Account(cardId, name, passWord, quotaMoney);
        // 5.把账户对象添加到集合中去
        accounts.add(account);
        System.out.println("恭喜您,"+account.getUserName()+"先生/女士，您开户完成，您的卡号是：" + account.getCardId());

    }

    public static String createCardID(ArrayList<Account> accounts) {
        // 关键点：为当前账户生成一个随机的8位数字作为卡号，卡号不能与其他用户的卡号重复。
        Random r = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }

            // 判断卡号是否重复
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc == null) {
                // 说明卡号没重复
                return cardId;
            }
        }


    }

    public static Account getAccountByCardId(String cardId, ArrayList<Account> accounts) {
        // 根据卡号查询对象
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;// 卡号无重复
    }

}
