package arraylist;

import java.util.ArrayList;

public class ArrayListTest5 {
    public static void main(String[] args) {
        ArrayList<Movie> movies=new ArrayList<>();
        //Movie s1=new Movie("肖生克的救赎",9.7,"罗宾斯");
        movies.add(new Movie("肖生克的救赎",9.7,"罗宾斯"));
        movies.add(new Movie("霸王别姬",9.6,"张国荣"));
        movies.add(new Movie("阿甘正传",9.5,"汤姆汉克斯"));
        System.out.println(movies);
        for (int i = 0; i < movies.size(); i++) {
            Movie movie=movies.get(i);
            System.out.println(movie.getName()+movie.getScore()+movie.getActor());
        }
    }   
}
