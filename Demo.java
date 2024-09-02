
/**
 * Movie Rating Lab
 *
 * @author (Rachit Jha)
 * @version (2/26/24)
 */
public class Demo
{
    public static double averageRatingByReviewer(int[][] ratings, int reviewerIndex){
        double d=0.0;
        int x=0;
        for(int i=0; i<ratings[0].length; i++){
            d+=ratings[reviewerIndex][i];
            x++;
        }
        double a=d/x;
        return a;
    }
    public static int aboveX(int[][] ratings, int x){
        int total=0;
        for(int i=0; i<ratings.length; i++){
            for(int j=0; j<ratings[0].length; j++){
                if(ratings[i][j]>x){
                    total++;
                }
            }
        }
        return total;
    }
    public static double averageRating(int[][] ratings, int movieIndex){
        double d=0.0;
        int x=0;
        for(int i=0; i<ratings.length; i++){
            d+=ratings[i][movieIndex];
            x++;
        }
        double a=d/x;
        return a;
    }
    public static void main(String[]args){
        int test[][]={{4, 6, 2, 5}, {7, 9, 4, 8}, {6, 9, 3, 7}};
        System.out.println(averageRatingByReviewer(test, 2));
        System.out.println(aboveX(test, 8));
        System.out.println(averageRating(test, 1));
    }
}