package String;

import java.util.Scanner;

public class StringEqualsDemo4 {
    public static void main(String[] args) {
        String okName="彦祖";
        String okPassword="111";
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("登录名称：");
            String name=sc.next();
            System.out.println("登录密码：");
            String password=sc.next();
            if(okName.equals(name) && okPassword.equals(password)){
                System.out.println("登录成功");
            }else{
                System.out.println("用户名或者密码错误。");
            }
        }
        String sysCore="23AGA";
        String code1="23aga";
        System.out.println(sysCore.equals(code1));
        System.out.println(sysCore.equalsIgnoreCase(code1));
    }
}
