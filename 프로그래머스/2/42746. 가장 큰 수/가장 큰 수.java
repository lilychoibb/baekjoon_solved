import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(int[] numbers) {
        List<String> collect = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .collect(Collectors.toList());

        if (collect.get(0).equals("0")) {
            return "0";
        }

        return String.join("", collect);
    }
}