import java.util.Scanner;

public class AnotherLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rating = 0;
        double averageRating = 0;
        int totalRatings = 0;

        while (rating != -1) {
            System.out.println("What is your rating for the movie? (type -1 to finish your input)");
            rating = input.nextDouble();

            if(rating != -1) {
                averageRating += rating;
                totalRatings++;
            }
        }

        System.out.println("Average rating: " + averageRating/totalRatings);
    }
}
