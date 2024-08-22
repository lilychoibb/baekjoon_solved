import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int solved = Integer.parseInt(st.nextToken());
        int union = Integer.parseInt(st.nextToken());
        int high = Integer.parseInt(st.nextToken());

        if (solved >= 1000 && (union >= 8000 || high >= 260)) {
            System.out.println("Very Good");
        } else if (solved >= 1000) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }
}
