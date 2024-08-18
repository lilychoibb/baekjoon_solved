import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";

        List<String> words = new ArrayList<>();
        while (!s.equals("#")) {
            s = sc.nextLine();
            words.add(s);
        }
        words.remove("#");
        Map<String, String> mirror = new HashMap<>();
        mirror.put("b", "d");
        mirror.put("d", "b");
        mirror.put("p", "q");
        mirror.put("q", "p");
        mirror.put("i", "i");
        mirror.put("o", "o");
        mirror.put("v", "v");
        mirror.put("w", "w");
        mirror.put("x", "x");

        for (String word : words) {
            String answer = "";
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(word.length() - 1 - i);
                boolean b = mirror.containsKey(String.valueOf(c));
                if (b) {
                    answer += mirror.get(String.valueOf(c));
                } else {
                    System.out.println("INVALID");
                    break;
                }
            }
            if (answer.length() == word.length()) {
                System.out.println(answer);
            }
            answer = "";
        }
    }
}
