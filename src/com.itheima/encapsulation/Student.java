package encapsulation;

public class Student {
    private int age;
    public char[] getAge;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age>=0 && age<200) {
            this.age=age;
        }else {
            System.out.println("年龄非法");
        }
    }

}
