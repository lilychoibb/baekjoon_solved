import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            a.add(sc.nextInt());
        }

        for (int i = 0; i < M; i++) {
            b.add(sc.nextInt());
        }

        int minA = Integer.MAX_VALUE;
        int minA2 = Integer.MAX_VALUE;
        int positionA = 0;
        for (int aa : a) {
            if (minA > aa) {
                minA = aa;
                minA2 = aa;
                positionA = a.indexOf(aa) + 1;
            }
        }

        int minB = Integer.MAX_VALUE;
        int positionB = 0;
        for (int bb : b) {
            if (minB > bb) {
                minB = bb;
                positionB = b.indexOf(bb) + 1;
            }
        }

        int countA = 1;
        while (minA != 0) {
            minA -= 1;
            countA += 1;
        }
        
        int countB = 1;
        if (minB == 0) {
            countB = positionB;
        }
        while (minB != 0) {
            minB -= 1;
            countB += 1;
        }

        if (minA2 > b.get(0)) {
            System.out.println(N + " " + countB);
        } else {
            System.out.println(positionA + " " + countA);
        }
    }
}
