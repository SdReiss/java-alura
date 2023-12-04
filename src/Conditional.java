public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 2010;
        boolean includedInThePlan = true;
        double rating = 7.5;
        String planType = "plus";

        if (releaseYear >= 2022) {
            System.out.println("This is a recent movie!");
        } else {
            System.out.println("This is s retro movie!");
        }

        if (includedInThePlan && planType.equals("plus")) {
            System.out.println("Movie unlocked!");
        } else {
            System.out.println("Movie should be rented");
        }
    }
}
