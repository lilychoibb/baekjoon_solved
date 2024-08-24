import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] room = new int[i];
        for (int j = 0; j < i; j++) {
            room[j] = sc.nextInt();
        }

        List<Integer> open = new ArrayList<>();
        for (int r : room) {
            for (int j = 0; j < r; j++) {
                open.add(0);
            }
            for (int j = 1; j < r + 1; j++) { //1~5
                for (int k = 1; j * k < r + 1; k++) { //1~5
                    if (open.get(j * k - 1) == 0) {
                        open.set(j * k - 1, 1);
                    } else if (open.get(j * k - 1) == 1) {
                        open.set(j * k - 1, 0);
                    }
                }
            }
            System.out.println(open.stream().filter(v -> v.equals(1)).count());
            open.clear();
        }
    }
}
