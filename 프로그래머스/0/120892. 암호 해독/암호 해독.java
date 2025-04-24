class Solution {
    public String solution(String cipher, int code) {
        
        StringBuilder sb = new StringBuilder();
        String[] cipherArr = cipher.split("");
        
        for (int i=1; i <= (cipherArr.length / code); i++) {
            sb.append(cipherArr[(code*i)-1]);
        }
        
        return sb.toString();
        
    }
}
