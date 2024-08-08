import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
         for (int[] size : sizes) {
            int origin = size[0];
            if (size[0] < size[1]) {
                size[0] = size[1];
                size[1] = origin;
            }
        }
        Integer w = Arrays.stream(sizes).max(Comparator.comparing(size -> size[0])).map(max -> max[0]).get();
        Integer h = Arrays.stream(sizes).max(Comparator.comparing(size -> size[1])).map(max -> max[1]).get();
        return w * h;
    }
}