package String;

import java.util.Scanner;

public class StringExec {
    public static void main(String[] args) {
        String UserName="admin";
        String PasseWord="123";
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                System.out.println("请输入登录名：");
                String inputUserName=sc.next();
                System.out.println("请输入登录密码：");
                String inputPassword=sc.next();
                if(UserName.equals(inputUserName)){
                    if(PasseWord.equals(inputPassword)){
                        System.out.println("登录成功。");
                        break;
                    }
                    else{
                        System.out.println("密码错了，您还剩余"+(2-i)+"次输入机会");
                    }
                }else{
                    System.out.println("登录名错了，您还剩余"+(2-i)+"次输入机会");
                }            
            }
        }
    }
}
