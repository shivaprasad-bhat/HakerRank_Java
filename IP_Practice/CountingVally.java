
import java.util.*;

public class CountingVally {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        String s = in.next();

        int level = 0;
        int valleys = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'U') {
                level++;
                if (level == 0) {
                    valleys++;
                }
            } else if (s.charAt(i) == 'D') {

                level--;
            }
        }
        in.close();
        System.out.println(valleys);
    }
}
