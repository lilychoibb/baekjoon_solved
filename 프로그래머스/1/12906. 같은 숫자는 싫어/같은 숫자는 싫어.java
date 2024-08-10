import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};

        List<Integer> stack = new ArrayList<>();

        for (int input : arr) {
            if (stack.isEmpty() || stack.get(stack.size()-1) != input) {
                stack.add(input);
            }
        }
        answer = stack.stream().mapToInt(a -> a).toArray();
        return answer;
    }
}