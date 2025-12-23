import java.util.*;

class Solution {
    public int solution(int order) {
        String intToStr = String.valueOf(order);
        int answer = 0;
        
        for (int i=0; i < intToStr.length(); i++) {
            int num = intToStr.charAt(i)-'0';
            
            if (num != 0 && num % 3 == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}