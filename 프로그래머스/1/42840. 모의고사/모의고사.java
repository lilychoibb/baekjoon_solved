import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] math1 = {1,2,3,4,5};
        int[] math2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] math3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int math1Count = 0;
        int math2Count = 0;
        int math3Count = 0;

        for (int i = 0; i < answers.length; i++) {
            if (math1[i % math1.length] == answers[i]) {
                math1Count += 1;
            }
        }

        for (int i = 0; i < answers.length; i++) {
            if (math2[i % math2.length] == answers[i]) {
                math2Count += 1;
            }
        }

        for (int i = 0; i < answers.length; i++) {
            if (math3[i % math3.length] == answers[i]) {
                math3Count += 1;
            }
        }

        Map<Integer, Integer> count = new HashMap<>();
        count.put(1, math1Count);
        count.put(2, math2Count);
        count.put(3, math3Count);
        int i = count.values().stream()
                .sorted(Comparator.comparingInt(s -> s))
                .max(Comparator.comparing(s1 -> s1))
                .get();

        List<Integer> answerList = new ArrayList<>();
        for (int j = 1; j < count.size() + 1; j++) {
            if (count.get(j) == i) {
                answerList.add(j);
            }
        }
        answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}