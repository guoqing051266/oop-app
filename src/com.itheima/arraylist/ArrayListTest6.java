package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest6 {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("20180302","  叶孤城",23,"护理一班"));
        students.add(new Student("20180303","东方不败",23,"推拿二班"));
        students.add(new Student("20180304","西门吹雪",26,"中药四班"));
        students.add(new Student("20180305","  梅超风",23,"神经2班"));
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);
            System.out.println(s.getStudyId()+"\t\t"+s.getName()+"\t\t"+s.getAge()+"\t\t"+s.getClassName());
        }
        Scanner sc=new Scanner(System.in);
        while(true){        
        System.out.println("请您输入需要查询的学号：");
        String id=sc.next();
        Student s=getStudentByStudyIStudent(students, id);
        if(s==null){
            System.out.println("查无此人。");
        }else{
            System.out.println(s.getStudyId()+"\t\t"+s.getName()+"\t\t"+s.getAge()+"\t\t"+s.getClassName());
        }
    }
    }
    public static Student getStudentByStudyIStudent(ArrayList<Student> students, String studyId){
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);
            if(s.getStudyId().equals(studyId)){
                return s;
            }
        }
        return null;
    }
}
