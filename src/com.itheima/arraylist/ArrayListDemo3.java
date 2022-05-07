package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MyBatis");
        list.add("HTML");
        String e=list.get(3);
        System.out.println(e);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));             
        }
        System.out.println(list);
        String e2=list.remove(2);    
        System.out.println(e2);
        System.out.println(list);
        System.out.println(list.remove("MyBatis"));
        System.out.println(list);    
        ArrayList<String> list1=new ArrayList<>();
        list1.add("Java");
        list1.add("王宝强");
        list1.add("Java");
        list1.add("MySQL");
        System.out.println(list1.remove("Java"));
        System.out.println(list1);    
        System.out.println(list.remove("Java"));
        System.out.println(list);  
        String e3=list1.set(0, "贾乃亮");
        System.out.println(e3);
        System.out.println(list1);  
    }
}
