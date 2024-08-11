import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

//        1. progresses 가 100 이 될때까지 speeds 를 몇 번 더해야 하는지
//        2. 큐에 담아서 앞의 작업일이 뒤의 작업일과 같거다 더 많으면 count++;
//        3. 배열에 담고 count 초기화
//        4. 뒤의 작업일 이어서 계산, 배열 그 위에 담기
        Queue<Integer> work = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int count = 0;
            while (progresses[i] < 100) {
                progresses[i] = progresses[i] + speeds[i];
                count++;
            }
            work.offer(count);
        }

        List<Integer> answerList = new ArrayList<>();
        int today = 1;
        boolean firstPeek = true;
        int first = work.peek();
        int workSize = work.size();
        while (answerList.stream().mapToInt(a -> a).sum() <= workSize) {
            if (work.peek() <= first) {
                if (firstPeek) {
                    today--;
                    firstPeek = false;
                }
                today++;
                if (work.size() == 1) {
                    answerList.add(today);
                    break;
                }
            }
            if (work.peek() > first) {
                if (work.size() == 1) {
                    answerList.add(1);
                    break;
                }
                first = work.peek();
              
            }
            work.poll();
            if (work.peek() > first) {
                answerList.add(today);
                today = 1;
            }
        }
        
        answer = answerList.stream().mapToInt(a -> a).toArray();

        return answer;
    }
}