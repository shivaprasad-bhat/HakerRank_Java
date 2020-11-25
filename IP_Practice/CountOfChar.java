import java.io.*;
import java.util.*;

public class CountOfChar {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long q = n / s.length();
        long r = n % s.length();
        int x1 = 0, x2 = 0;
        String[] s1 = s.split("");
        for (String x : s1) {
            if (x.equals("a")) {
                x1++;
            }
        }

        x1 = x1 * (int) q;

        for (int i = 0; i < r; i++) {
            if (s1[i].equals("a")) {
                x2++;
            }
        }
        return (x1 + x2);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        long n = scanner.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        scanner.close();
    }
}
