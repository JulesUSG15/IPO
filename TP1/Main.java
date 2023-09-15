import java.util.Scanner;
import src.CaseInsensitiveHammingMeter;
import src.HammingMeter;
public class Main {
    public static void main(String[] args) {
        CaseInsensitiveHammingMeter hm = new CaseInsensitiveHammingMeter();
        HammingMeter hm2 = new HammingMeter();
        Scanner sc = new Scanner(System.in);

        if (args.length == 2 || args.length == 3 && args[2].equals("-i") || args.length == 3 && args[2].equals("--ignore-case")) {
            if (args[0].length() != args[1].length()) {
                System.out.println("Strings must be of equal length");
                System.exit(1);
            }
            if (args.length == 3) {
                System.out.println(hm.distance(args[0], args[1]));
                System.exit(0);
            }
            else {
                System.out.println(hm2.distance(args[0], args[1]));
                System.exit(0);
            }
        } else {
            System.out.println("Usage: java Main <string1> <string2> [-i|--ignore-case]");
            System.exit(1);
        }

        /*String str = sc.nextLine();
        String[] words = str.split(" ");

        if (words.length == 2 || words.length == 3 && words[2].equals("-i") || words.length == 3 && words[2].equals("--ignore-case")) {
            if (words[0].length() != words[1].length()) {
                System.out.println("Strings must be of equal length");
                System.exit(1);
            }
            if (words.length == 3) {
                System.out.println(hm.distance(words[0], words[1]));
                System.exit(0);
            }
            else {
                System.out.println(hm2.distance(words[0], words[1]));
                System.exit(0);
            }
        } else {
            System.out.println("Usage: java Main <string1> <string2> [-i|--ignore-case]");
            System.exit(1);
        }*/
    }
}
