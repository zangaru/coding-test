import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        
//         List<Integer> list = new ArrayList<>();
//         for (int num : numbers) {
//             list.add(num);
//         }
        
//         if (direction.equals("right")) {
//             int lastNum = list.get(list.size() - 1);
//             list.remove(list.size() - 1);
//             list.add(0, lastNum);
//         } else {
//             int firstNum = list.get(0);
//             list.remove(0);
//             list.add(firstNum);
//         }
        
//         int[] answer = new int[list.size()];
//         for (int i = 0; i < list.size(); i++) {
//             answer[i] = list.get(i);
//         }
        
//         return answer;
        
        int length = numbers.length;
        int[] answer = new int[length];
        
        if (direction.equals("right")) {
            answer[0] = numbers[length - 1];
        
            for(int i = 0; i < length - 1; i++) {
                answer[i + 1] = numbers[i];
            }
        } else {
            answer[length - 1] = numbers[0];
            
            for(int i = 1; i < length; i ++) {
                answer[i - 1] = numbers[i];
            }
        }
        
        return answer;
    }
}