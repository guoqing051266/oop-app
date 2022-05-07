package javabean;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args) {
        Goods[] shopCar =new Goods[100];
        while (true) {
        System.out.println("请您选择如下命令进行操作：");
        System.out.println("请添加商品到购物车：add");
        System.out.println("查询商品：query");
        System.out.println("修改商品购买数量：update");
        System.out.println("结算购买商品的金额：pay");
        Scanner sc=new Scanner(System.in);
        String command=sc.next();
        switch (command){
            case "add":                
                addGoods(shopCar, sc);
                break;
            case "query":                       
                queryGoods(shopCar);                    
                break;
            case "update":                
                updateGoods(shopCar, sc);    
                break;
            case "pay":                
                pay(shopCar);
                break;
            default:
                System.out.println("没有该功能");
            }
        }        
    }           
    private static void pay(Goods[] shopCar) {
        double amount=0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g=shopCar[i];
            if(g!=null){
                amount+=g.getPrice()*g.getQuantity();
            }else{
                break;
            }
        }
        System.out.println("订单总金额为："+amount);
    }
    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        while(true){
            System.out.println("请输入需要修改数量的商品id:");
            int id=sc.nextInt();
            Goods g=getGoodsById(shopCar, id);
            if(g==null){
                System.out.println("对不起，没有购买该商品");
            }else{
                System.out.println("请您输入"+g.getName()+"商品最新购买的数量：");
                int quantity=sc.nextInt();
                g.setQuantity(quantity);
                System.out.println("修改完成");
                queryGoods(shopCar);
                break;
            }
        }
    }
    public static Goods getGoodsById(Goods[] shopCar, int id){
        for (int i = 0; i < shopCar.length; i++) {
            Goods g=shopCar[i];
            if(g!=null){
                if(g.getId()==id){
                    return g;
                }
            }else{
                return null;
            }            
        }
        return null;       
    }
    public static void queryGoods(Goods[] shopCar) {
        System.out.println("=============查询信息如下===========");
        System.out.println("编号\t\t名称\t\t\t价格\t\t\t购买数量");
             for (int i = 0; i < shopCar.length; i++) {
                Goods g= shopCar[i];
                if(g!=null){
                    System.out.println(g.getId()+"\t\t"+g.getName()+"\t\t\t"+g.getPrice()+"\t\t\t"+g.getQuantity());
                }else {
                    break;
                }
            }
    }
    public static void addGoods(Goods[] shopCar, Scanner sc) {
        System.out.println("请您输入购买商品的编号：");
        int id=sc.nextInt();
        System.out.println("请您输入购买商品的名称：");
        String name =sc.next();
        System.out.println("请您输入购买商品的数量：");
        int quantity=sc.nextInt();
        System.out.println("请您输入购买商品的价格：");
        double price=sc.nextDouble();
        Goods g=new Goods();
        g.setId(id);
        g.setName(name);
        g.setPrice(price);
        g.setQuantity(quantity);
        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i]==null){
                shopCar[i]=g;
                break;
            }
        }
        System.out.println("您的商品："+g.getName()+"已添加到购物车完成！");    
    }
}
