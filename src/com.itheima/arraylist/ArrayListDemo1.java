package arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("java");
        list.add("java");
        list.add("MySQL");
        list.add("彦祖");
        list.add("3333");
        list.add("66.2");
        list.add(false);       
        System.out.println(list);
        list.add(1,"梅西");
        System.out.println(list);
        }
}
