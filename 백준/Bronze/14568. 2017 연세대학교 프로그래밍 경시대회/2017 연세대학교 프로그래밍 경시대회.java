import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        남규, 영훈, 택희
//        남는 사탕은 없어야 한다.
//        남규는 영훈이보다 2개 이상 많은 사탕을 가져야 한다.
//        셋 중 사탕을 0개 받는 사람은 없어야 한다.
//        택희가 받는 사탕의 수는 홀수개가 되어서는 안 된다.

        Scanner sc = new Scanner(System.in);

        int candy = sc.nextInt();
        int taek = 0;

        int count = 0;
        while (true) {
            candy -= 2;
            taek += 2;
            if (candy < 4) {
                break;
            }
            if (candy % 2 == 0) {
                count += candy - (candy / 2 + 1);
            } else {
                count += candy - (candy / 2 + 2);
            }
        }

        System.out.println(count);
    }
}
