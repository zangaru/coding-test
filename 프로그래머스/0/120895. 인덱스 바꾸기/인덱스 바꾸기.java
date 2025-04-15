class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        StringBuilder sb = new StringBuilder(my_string);
        
        char num1Char = sb.charAt(num1);
        char num2Char = sb.charAt(num2);
        
        sb.setCharAt(num1, num2Char);
        sb.setCharAt(num2, num1Char);
        
        return sb.toString();   
    }
}