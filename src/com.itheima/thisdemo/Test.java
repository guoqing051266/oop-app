package thisdemo;

public class Test {
    public static void main(String[] args) {
        Car c=new Car("奔驰", 45);
        System.out.println(c.name);
        System.out.println(c.price);
        System.out.println("===============");
        System.out.println(c+"     654");
        c.goWith("宝马");
    }
}
