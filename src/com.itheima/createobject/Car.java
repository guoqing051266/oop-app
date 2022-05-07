package createobject;

public class Car{
    String name;
    double price;

    public void start(){
        System.out.println(name+",价格是："+price+"启动了");
    }
    public void run(){
        System.out.println(name+",价格是："+price+"跑得很快");
    }
}