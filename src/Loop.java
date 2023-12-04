import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rating = 0;
        double averageRating = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("What is your rating for the movie?");
            rating = input.nextDouble();
            averageRating += rating;
        }

        System.out.println("Average rating: " +     averageRating/3);
    }
}
