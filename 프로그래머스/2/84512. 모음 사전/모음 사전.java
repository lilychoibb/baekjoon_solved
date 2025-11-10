class Solution {
    static String[] aeiou = {"A", "E", "I", "O", "U"};
    static int count = 0;
    static int answer = 0;
    
    public int solution(String word) {
        dfs("", word);
        return answer;
    }
    
    public void dfs (String current, String word) {
        if(current.length() > 5) return;
        if(!current.equals("")) count ++;
        if(current.equals(word)) answer = count;
        
        for(int i = 0; i < 5; i++){
            dfs(current + aeiou[i], word);   
        }
    }
}