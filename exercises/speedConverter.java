package exercises;

public class speedConverter {
    public static void main(String[] args) {
        toMilesPerHour(10.25);
        printConversion(10.25);
    }

    public static long toMilesPerHour(double kilometersPerHour) {      
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double milesPerHour = kilometersPerHour / 1.609344;
            long rounded = Math.round(milesPerHour);
            return rounded;
        }
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
        toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h" + " = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        };
    }
}
