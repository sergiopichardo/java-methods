/*
* 1 MB = 1024 KB
*/

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            long megaBytes = Math.round(kiloBytes / 1024);
            long remainingKiloBytes = kiloBytes % 1024;
            System.out.println(remainingKiloBytes);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
