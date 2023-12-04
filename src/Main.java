public class Main {
    public static void main(String[] args) {
        System.out.println("This is Screen Match");
        System.out.println("Movie: Scott Pilgrim Vs. The World");

        int releaseYear = 2010;
        System.out.println("Release Year: " + releaseYear);
        boolean includedInThePlan = true;
        double rating = 7.5;

        double averageRating = (8.6 + 7.5 + 9.2) / 3;
        System.out.println(averageRating);

        String synopsis = """
                        A guy has to fight the seven evil exes of the girl he want to date
                        """ + releaseYear;
        System.out.println(synopsis);

        int score = (int) (averageRating / 2);
        System.out.println(score);
    }
}