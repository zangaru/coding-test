class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else {
                answer.append(Character.toUpperCase(c));
            }
            
        }
        return answer.toString();
    }
}

/* 
[StringBuilder 사용한 이유]

String 은 불변 객체로, 한 번 생성된 String 객체는 내용을 변경할 수 없다.
문자열을 수정할 때마다 새로운 String 객체가 생성되므로 메모리 사용이 증가되고 성능 저하가 일어날 수 있다.

StringBuilder는 가변 객체로, 한 번 생성된 후에도 내부의 문자열 내용을 변경할 수 있다.
append(), insert(), delete()와 같은 메서드를 이용해 문자열을 조작할 수 있다.
문자열을 수정할 때마다 새로운 객체가 생성되지 않기 때문에, 메모리 사용이 더 효율적이며, 성능 또한 향상된다.
*/
