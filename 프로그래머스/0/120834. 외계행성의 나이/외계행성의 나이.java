class Solution {
    public String solution(int age) {
        
        StringBuilder answer = new StringBuilder();
        
        String age962 = "abcdefghij";
        String[] ageArr = String.valueOf(age).split("");
        
        for (int i = 0; i < ageArr.length; i++) {
            answer.append(age962.charAt(Integer.valueOf(ageArr[i])));
        }
        return answer.toString();
    }
}