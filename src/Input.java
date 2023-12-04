import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type your favorite movie:");
        String movie = input.nextLine();

        System.out.println("What is the release year?");
        int releaseYear = input.nextInt();

        System.out.println("What is your rating for the movie?");
        double rating = input.nextDouble();

        System.out.println(movie);
        System.out.println(releaseYear);
        System.out.println(rating);
    }
}
