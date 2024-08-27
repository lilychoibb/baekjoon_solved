import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        for (int j = 0; j < i; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            int min = Integer.MAX_VALUE;
            for (int k = 0; k < 7; k++) {
                int i1 = Integer.parseInt(st.nextToken());
                if (i1 % 2 == 0) {
                    sum += i1;
                    if (min > i1) {
                        min = i1;
                    }
                }
            }
            System.out.println(sum + " " + min);
        }
            br.close();
    }
}
