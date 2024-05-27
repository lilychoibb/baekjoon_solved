import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();

        List<String> words = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            words.add(sc.nextLine());
        }

        int result = 0;

        for (String word : words) {
            if (isGroupWord(word)) {
                result++;
            }
        }

        System.out.println(result);
    }

    public static boolean isGroupWord(String word) {
        Set<Character> seen = new HashSet<>();
        char prev = 0;

        for (char ch : word.toCharArray()) {
            if (ch != prev) {
                if (seen.contains(ch)) {
                    return false;
                }
                seen.add(ch);
                prev = ch;
            }
        }

        return true;
    }
}
