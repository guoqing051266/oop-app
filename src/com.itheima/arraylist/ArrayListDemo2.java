package arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("java");
        list.add("Mysql");
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(23);
        list2.add(111);
        System.out.println(list+"   "+list2);
        
    }
}
