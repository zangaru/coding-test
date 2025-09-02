import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int X = sc.nextInt();
        
        List<Integer> A = new ArrayList<>();
        
        for(int i=0; i<N; i++) {
            int a = sc.nextInt();
            A.add(a);
        }

        for (Integer a : A) {
            if(a < X) {
                System.out.print(a + " ");
            }
        }
    }
}

