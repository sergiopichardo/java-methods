public class BarkingDog {

    /*
    * barking       boolean      represents the dog currently barking
    * hourOfDay     int          valid range 0-23
    * */
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && (hourOfDay < 0 || hourOfDay > 23)) {
            return false;
        } else {
            return barking && (hourOfDay < 8 || hourOfDay > 22);
        }
    }
}

 