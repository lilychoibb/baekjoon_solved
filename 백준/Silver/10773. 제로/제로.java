import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < input; i++) {
            int value = sc.nextInt();
            if (value == 0) {
                stack.pop();
            } else {
                stack.push(value);
            }
        }
        int result = 0;
        for (Integer integer : stack) {
            result += integer;
        }
        System.out.println(result);
    }
}
