import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int i1 = Integer.parseInt(s.split(" ")[0]);
        List<Integer> cost = new ArrayList<>();
        for (int i = 0; i < i1; i++) {
            cost.add(sc.nextInt());
        }

        int i2 = Integer.parseInt(s.split(" ")[1]);
        int[] aval = new int[i2];
        for (int i = 0; i < i2; i++) {
            aval[i] = sc.nextInt();
        }

        List<Integer> point = new ArrayList<>();
        for (int i = 0; i < cost.size(); i++) {
            point.add(0);
        }
        for (int av : aval) {
            for (int co : cost) {
                if (co <= av) {
                    int i = cost.indexOf(co);
                    point.set(i, point.get(i) + 1);
                    break;
                }
            }
        }

        System.out.println(point.indexOf(Collections.max(point)) + 1);
    }
}
