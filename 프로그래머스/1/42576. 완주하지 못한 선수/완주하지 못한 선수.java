import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            if (!map.containsKey(p)) {
                map.put(p, 1);
            } else {
                map.put(p, map.get(p) + 1);
            }
        }

        for (String pp : completion) {
            if (map.containsKey(pp) && map.get(pp) == 1) {
                map.remove(pp);
            } else {
                map.put(pp, map.get(pp) - 1);
            }
        }
        HashSet<String> set = new HashSet<>(map.keySet());

        for (String s : set) {
            answer = s;
        }
        return answer;
    }
}
