import java.util.Scanner;

public class PrettyHeader {

    public static void main(String[] args) {
        String msg;
        int width = 54;
        Scanner pipe = new Scanner (System.in);
        System.out.print ("Enter a message to for a header: ");
        msg = pipe.next();
        int spaceTaken = width - msg.length();
        int center = (spaceTaken - msg.length()) / 2;

        for (int i = 1; i <= 1; i++) {
            for (int x = 1; x <= 60; x++) {
                System.out.print ("*");
            }
            System.out.println ();
        }
        for (int i = 1; i <= 1; i++) {
            for (int x = 1; x <= 3; x++) {
                System.out.print ("*");
            }
        }
        for (int i = 1; i <= 1; i++) {
            for (int x = 1; x <= center + msg.length(); x++) {
                System.out.print (" ");
            }
        }
        System.out.format ("%" + msg.length() + "s", msg);
        for (int i = 1; i <= 1; i++) {
            for (int x = 1; x <= center - (msg.length() / 2); x++) {
                System.out.print (" ");
            }
        }
        for (int i = 1; i <= 1; i++) {
            for (int x = 1; x <= 3; x++) {
                System.out.print ("*");
            }
            System.out.println ();
        }
        for (int i = 1; i <= 1; i++) {
            for (int x = 1; x <= 60; x++) {
                System.out.print ("*");
            }
            System.out.println ();
        }
    }

}

