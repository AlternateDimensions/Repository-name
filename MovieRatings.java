import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class MovieRatings{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("rotten_tomatoes_top_movies.csv")); 
        sc.useDelimiter(",");   //sets the delimiter pattern  

        ArrayList<Movie> movies = new ArrayList<Movie>(0);
 
        Object[] temp = new Object[9];

        int index = 0;

        int stopper = 8;
        int end = 25;

        int differ = 0;
        int notDiffer = 0;

        while (sc.hasNext()){
            if (index == 0){
                movies.add(new Movie(String.valueOf(temp[0]), (int) temp[1], String.valueOf(temp[2]), (int) temp[3], (int) temp[4], String.valueOf(temp[5]), (int) temp[6], (int) temp[7], String.valueOf(temp[8]) ));
            }
            if (index <= stopper){
                temp[index] = sc.next();
            }
            if (index == end){
                index = 0;
            } else {
                index++;
            }
        }

        System.out.println("Do critics heavily (+/- 5%) differ from the general audience for most of the top movies?\n\n");

        for (Movie movie : movies){
            int rating = Math.abs((int) movie.getMovie()[3] - (int) movie.getMovie()[4]);
            if (rating >= 5){
                differ++;
            } else {
                notDiffer++;
            }
        }

        if (differ > notDiffer){
            System.out.println("Critics do heavily differ!");
        } else {
            System.out.println("Critics don't heavily differ!");
        }

    }
}

class Movie{
    private String name;
    private int year;
    private String synopsis;
    private int criticScore;
    private int audienceScore;
    private String concensus; 
    private int totalReviews;
    private int totalRatings;
    private String type;

    public Movie(String n, int y, String s, int c, int a, String co, int tRe, int tRa, String t){
        name = n;
        year = y;
        synopsis = s;
        criticScore = c;
        audienceScore = a;
        concensus = co;
        totalReviews = tRe;
        totalRatings = tRa;
        type = t;
    }
    
    public void setMovie(String n, int y, String s, int c, int a, String co, int tRe, int tRa, String t){
        name = n;
        year = y;
        synopsis = s;
        criticScore = c;
        audienceScore = a;
        concensus = co;
        totalReviews = tRe;
        totalRatings = tRa;
        type = t;
    }

    public Object[] getMovie(){
        return new Object[]{name, year, synopsis, criticScore, audienceScore, concensus, totalReviews, totalRatings, type};
    }

}