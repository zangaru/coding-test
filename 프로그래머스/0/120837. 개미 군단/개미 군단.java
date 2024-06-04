class Solution {
    public int solution(int hp) {
    
        int a,b,c;
        
        a = hp/5;
        b = (hp%5)/3;
        c = ((hp%5)%3)/1;
        
        int answer = a+b+c;
        return answer;
    }
}