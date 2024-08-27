import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();
        List<Integer> answer = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            String s = sc.nextLine();
            int row = Integer.parseInt(s.split(" ")[1]);
            int column = Integer.parseInt(s.split(" ")[0]);
            BigInteger[][] ii = new BigInteger[row][column];

            for (int k = 0; k < row; k++) {
                String s1 = sc.nextLine();
                for (int l = 0; l < column; l++) {
                    ii[k][l] = new BigInteger(s1.split(" ")[l]);
                }
            }

            int max = 0;
            List<BigInteger> a = new ArrayList<>();
            for (int k = 0; k < column; k++) {
                BigInteger temp = BigInteger.ONE;
                for (int l = 0; l < row; l++) {
                    temp = temp.multiply((ii[l][k]));
                }
                a.add(temp);
            }

            BigInteger maxValue = a.get(0);
            for (int k = 0; k < a.size(); k++) {
                if (a.get(k).compareTo(maxValue) >= 0) {
                    maxValue = a.get(k);
                    max = k + 1;
                }
            }
            answer.add(max);
        }
        answer.forEach(System.out::println);
    }
}
