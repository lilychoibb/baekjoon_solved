import java.util.Scanner;

public class Main {
    static int[][] tree;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine(); //
        tree = new int[26][2];
        for (int i = 0; i < input; i++) {
            String[] temp = sc.nextLine().split(" ");
            int node = temp[0].charAt(0) - 'A'; // A 는 0
            char left = temp[1].charAt(0);
            char right = temp[2].charAt(0);
            if (left == '.') {
                tree[node][0] = -1;
            } else {
                tree[node][0] = left - 'A';
            }
            if (right == '.') {
                tree[node][1] = -1;
            } else {
                tree[node][1] = right - 'A';
            }
        }
        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);
    }

    public static void preOrder(int node) { //정면, 왼쪽, 오른쪽
        if (node == -1) {
            return;
        }
        System.out.print((char)(node + 'A'));
        preOrder(tree[node][0]);
        preOrder(tree[node][1]);
    }

    public static void inOrder(int node) { //왼쪽, 정면, 오른쪽
        if (node == -1) {
            return;
        }
        inOrder(tree[node][0]);
        System.out.print((char)(node + 'A'));
        inOrder(tree[node][1]);
    }

    public static void postOrder(int node) { //왼쪽, 오른쪽, 정면
        if (node == -1) {
            return;
        }
        postOrder(tree[node][0]);
        postOrder(tree[node][1]);
        System.out.print((char)(node + 'A'));
    }
}
