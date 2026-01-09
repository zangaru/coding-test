import java.util.*;

class Solution {
    public String solution(String my_string) {

        boolean[] seen = new boolean[256];
        StringBuilder sb = new StringBuilder();
        
        for (char c : my_string.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        
        return sb.toString();

    }
}