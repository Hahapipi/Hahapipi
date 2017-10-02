import java.util.Scanner;

public class EEE

        //id:106022414
        //name:林虹汶
        //date:20171002
        //purpose:三角形判定
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            char ch = scn.next().charAt(0);

            if (ch - 'A' >= 0 && ch - 'A' < 26) {
                System.out.println((char) ('a' + (ch - 'A')));
            } else {
                if (ch - 'a' >= 0 && ch - 'a' < 26) {
                    System.out.println((char) ('A' + (ch - 'a')));
                }

            }

        }
} {
}
