import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();

        int[] point = new int[i];
        int[] count = new int[i];
        int[] time = new int[i];
        for (int j = 0; j < i; j++) {
            String s = sc.nextLine();
            point[j] = Integer.parseInt(s.split(" ")[0]);
            count[j] = Integer.parseInt(s.split(" ")[1]);
            time[j] = Integer.parseInt(s.split(" ")[2]);
        }

        int max = 0;
        for (int j = 1; j < i; j++) {
            if (point[max] < point[j]) {
                max = j;
            } else if (point[max] == point[j]) {
                if (count[max] > count[j]) {
                    max = j;
                } else if (count[max] == count[j]) {
                    if (time[max] > time[j]) {
                        max = j;
                    }
                }
            }
        }
        System.out.println(max + 1);
    }
}
