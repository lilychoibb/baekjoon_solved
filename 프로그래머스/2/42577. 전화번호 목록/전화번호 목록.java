import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
       Map<String, Integer> map = new HashMap<>();

        for (String s : phone_book) {
            map.put(s, s.length());
        }

        for (String s : phone_book) {
            for (int i = 1; i < map.get(s); i++) {
                if (map.containsKey(s.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
