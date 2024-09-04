import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> collect = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());

        int max = 0;
        for (int i = 1; i <= Integer.parseInt(s.split(" ")[1]); i++) {
            int ii = i;
            long count = collect.stream()
                    .filter(v -> Integer.parseInt(v) == ii)
                    .count();
            if (count > max) {
                max = (int) count;
            }
        }
        System.out.println(max);
    }
}
