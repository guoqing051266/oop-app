package javabean;

public class Test {
    public static void main(String[] args) {
        User u=new User();
        u.setName("吴彦祖");
        u.setHeight(183);
        u.setSalary(1555);
        System.out.println(u.getName());
        System.out.println(u.getHeight());
        System.out.println(u.getSalary());       
        User u2=new User("关之琳", 169.5,555);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSalary());  
    }
}
