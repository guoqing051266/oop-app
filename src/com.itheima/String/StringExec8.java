package String;

import java.util.Random;

public class StringExec8 {
    public static void main(String[] args) {
        String dates="abcdefghijklmnopqrstuvwxyaABCDEFGHIJKLNMOPQRSTUVWXYZ0123456789";
        Random r=new Random();
        String code="";
        for (int i = 0; i < 5; i++) {
            int index=r.nextInt(dates.length());
            char c=dates.charAt(index);
            code+=c;
        }
            System.out.println(code);
    }
}
