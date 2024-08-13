import java.util.*;
class Solution {
        boolean solution(String s) {
        boolean answer = true;
        
        String[] split = s.split("");

        int count = 0;
        
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("(")) {
                count += 1;
                if (i == split.length - 1) {
                    answer = false;
                    break;
                }
            }
            if (split[i].equals(")")) {
                if (count != 0) {
                    count -= 1;
                } else {
                    answer = false;
                    break;
                }
            }
        }

        if (count != 0) {
            answer = false;
        }
        return answer;
    }
}