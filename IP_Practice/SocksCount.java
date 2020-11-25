import java.io.*;
import java.util.*;

/**
 * HackerRank Problem Alex works at a clothing store. There is a large pile of
 * socks that must be paired by color for sale. Given an array of integers
 * representing the color of each sock, determine how many pairs of socks with
 * matching colors there are.
 * 
 * @author Shivaprasad Bhat
 * @date 25 Nov 2020
 */

public class SocksCount {

    /**
     * Function to calculate Socks pairs
     * 
     * @param int N, int array ar
     * @return Count of pairs of same color
     */
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        int temp;

        // Store the pairs
        for (int x : ar) {
            if (h.containsKey(x)) {
                temp = h.get(x);
                temp = temp + 1;
                h.put(x, temp);
            } else {
                h.put(x, 1);
            }
        }

        temp = 0;
        for (HashMap.Entry<Integer, Integer> hm : h.entrySet()) {
            temp += (hm.getValue() / 2);
        }

        return temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
