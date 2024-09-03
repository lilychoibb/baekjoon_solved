import java.util.Scanner;

public class Main {
    static int i;
    static int count = 0;

    public static void main(String[] args) {
        // 맨 앞, 맨 뒤 곱
        // 곱한 수가 주어진 수보다 크면 뒤 숫자를 내리기
        // 곱한 수가 주어진 수보다 작아지면 앞 숫자를 올리기
        // 수가 만나거나 역전이 되면 종료

        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        sc.nextLine();
        System.out.println(multiply(1, i));
    }

    private static int multiply(int first, int last) {
        if (first > last) {
            return count;
        }
        if (first * last == i) {
            if (first != last) {
                count += 2;
            } else {
                count += 1;
            }
        }
        return multiply(first + 1, i / (first + 1));
    }
}
