import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
// 딸기 -> 초코 -> 바나나 -> 딸기 0 1 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        int[] milk = {0, 1, 2};
        StringTokenizer st = new StringTokenizer(br.readLine());
        int drink = 0;
        int now = 0;
        for (int j = 0; j < i; j++) { //1~8
            String s = st.nextToken();
            if (milk[now] == Integer.parseInt(s)) {
                drink += 1;
                now += 1;
                if (now >= 3) {
                    now = now % 3;
                }
            }
        }
        System.out.println(drink);
        br.close();
    }
}
