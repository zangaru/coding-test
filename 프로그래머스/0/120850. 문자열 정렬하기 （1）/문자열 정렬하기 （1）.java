import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        // 숫자 갯수 세기
        int count = 0;
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        
        int[] onlyNumber = new int[count];
        int index = 0;
        
        // 숫자만 배열에 저장
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                onlyNumber[index++] = c - '0';
            }
        }
        
        Arrays.sort(onlyNumber);
        
        return onlyNumber;
    }
}