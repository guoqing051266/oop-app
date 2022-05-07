package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts=new ArrayList<>();
        showMain(accounts);
    }
    public static void showMain(ArrayList<Account> accounts) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请您输入您想要的操作：");
        System.out.println("1.登录");
        System.out.println("2.开户");
        int command=sc.nextInt();
        switch (command) {
            case 1:
                
                break;
            case 2:

            break;
        
            default:
                System.out.println("您当前输入的操作命令不被支持执行。");
        }
        }
    }
    private static void register(ArrayList<Account>accounts) {

        
    }
}
