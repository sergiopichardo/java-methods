
//printConversion(10.5);
//printConversion(-5.6);
//printConversion(75.114);

public class Main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);
        SpeedConverter.printConversion(miles);
    }
}
