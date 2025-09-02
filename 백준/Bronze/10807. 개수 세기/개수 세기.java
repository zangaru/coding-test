import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> numberList = new ArrayList<>();

        int count = 0;

        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            numberList.add(a);
        }

        int v = sc.nextInt();
        
        for (Integer number : numberList) {
            if (v == number) {
                count++; 
            }              
        }

        System.out.println(count);

        sc.close();
    }
}

