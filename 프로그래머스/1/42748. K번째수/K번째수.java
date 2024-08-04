import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> answerTemp = new ArrayList<>();
        for (int[] i : commands) {
            int start = i[0] - 1;
            int finish = i[1];
            List<Integer> list = new ArrayList<>();
            for (int j = start; j < finish; j++) {
                list.add(array[j]);
            }
            list.sort(Comparator.comparingInt(a -> a));
            answerTemp.add(list.get(i[2] - 1));
        }
        answer = answerTemp.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}