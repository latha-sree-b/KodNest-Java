import java.util.*;

public class kod2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();
        System.out.println(mergeAlternately(word1, word2));
        scanner.close();
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int n = Math.max(word1.length(), word2.length());

        for (int i = 0; i < n; i++) {
            if (i < word1.length()) {
                res.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                res.append(word2.charAt(i));
            }
        }

        return res.toString();
    }
}
