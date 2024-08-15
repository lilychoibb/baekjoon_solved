import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int first = Integer.parseInt(s.split(" ")[0]);
        int plus = Integer.parseInt(s.split(" ")[1]);
        int find = Integer.parseInt(s.split(" ")[2]);

        int count = 1;
        int dif = find - first;
        while (true) {
            if (first == find) {
                System.out.println(count);
                break;
            }
            first += plus;
            count += 1;
            if (first == find) {
                System.out.println(count);
                break;
            }
            if (plus > 0 && find - first > dif) {
                System.out.println("X");
                break;
            }

            if (plus < 0 && find - first < dif) {
                System.out.println("X");
                break;
            }
        }

    }
}
