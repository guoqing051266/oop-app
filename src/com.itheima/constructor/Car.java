package constructor;

public class Car {
    String name;
    double price;
    
    public Car(){
        System.out.println("无参数构造器被触发执行");
    }
    public Car(String n, double p){
        System.out.println("有参构造器被触发执行");
        name=n;
        price=p;
    }
}
