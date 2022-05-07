package String;

public class StringAPIOtherDemo5 {
    public static void main(String[] args) {
        String name="我爱你中国love";
        System.out.println(name.length());
        System.out.println(name.charAt(1));
        System.out.println("=============便利字符==============");
        for (int i = 0; i < name.length(); i++) {
            char ch=name.charAt(i);
            System.out.println(ch);
        }
        char[] chars=name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch=chars[i];
            System.out.println(ch);
        }
        String name2="java是最厉害的程序语言";
        name2.substring(0,9);
        System.out.println(name2.substring(0, 9));
        System.out.println(name2.substring(4, 9));
        System.out.println(name2.substring(4));
        String name3="金三胖是最厉害的80后，金三胖棒棒哒，我爱金三胖。";
        System.out.println(name3.replace("金三胖", "@@@"));
        System.out.println(name3.contains("金三胖"));
        System.out.println(name3.startsWith("金三胖"));
        System.out.println(name3.startsWith("金三胖是最厉害的2"));
        String name4="王宝强，贾乃亮，陈羽凡";
        String[] names=name4.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }        
    }
}
