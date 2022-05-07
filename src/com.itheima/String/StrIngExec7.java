package String;

import java.util.Scanner;

public class StrIngExec7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的手机号：");
        String tel=sc.next();
        String front=tel.substring(0,3);
        String back=tel.substring(7);
        String s=front+"****"+back;
        System.out.println("隐匿中间段后的号码为："+s);
    }
}
