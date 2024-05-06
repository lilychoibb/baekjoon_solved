import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bf.readLine());

        Stack<Integer> stack = new Stack<>();

        StringTokenizer st;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < input; i++) {
            st = new StringTokenizer(bf.readLine());

            int re = Integer.parseInt(st.nextToken());

            if (re == 1) {
                stack.push(Integer.valueOf(st.nextToken()));
            } else if (re == 2) {
                if (!stack.isEmpty()) {
                    bw.write(String.valueOf(stack.pop()));
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                }
            } else if (re == 3) {
                bw.write(String.valueOf(stack.size()));
                bw.newLine();
            } else if (re == 4) {
                if (!stack.isEmpty()) {
                    bw.write(String.valueOf(0));
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(1));
                    bw.newLine();
                }
            } else if (re == 5) {
                if (!stack.isEmpty()) {
                    bw.write(String.valueOf(stack.peek()));
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
