package String;

public class StringDemo2 {
    public static void main(String[] args) {
        String name="我爱你中国";
        System.out.println(name);
        String s1=new String();
        System.out.println(s1);
        String s2= new String("我是中国人");
        System.out.println(s2);
        char[] chars={'a','b','中','国'};
        String s3=new String(chars);
        System.out.println(s3);
        byte[] bytes={97,98,96,65,66,67};
        String s4=new String(bytes);
        System.out.println(s4);
        System.out.println("================");
        String ss1="ab中国";
        System.out.println(s3==ss1);
        String ss3=new String(chars);
        System.out.println(ss3==s3);
        String str1="ab";
        String str2=new String("ab");
        String str3="a"+"b";
        String str4=new String("a")+new String("b");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str2==str3);
        System.out.println(str2==str4);
        System.out.println(str3==str4);
        
    }
}
