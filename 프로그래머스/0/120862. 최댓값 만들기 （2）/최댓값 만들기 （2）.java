import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        // 양수 값 저장
        int a = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        // 음수 값 저장
        int b = numbers[0] * numbers[1];
        
        return (a > b) ? a : b;
    }
}