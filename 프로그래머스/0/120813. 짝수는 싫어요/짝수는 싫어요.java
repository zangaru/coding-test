class Solution {
    public int[] solution(int n) {
        int size = (n + 1) / 2; 
        int[] answer = new int[size]; 

        for (int i = 0, num = 1; i < size; i++, num += 2) {
            answer[i] = num; 
        }

        return answer;
    }
}