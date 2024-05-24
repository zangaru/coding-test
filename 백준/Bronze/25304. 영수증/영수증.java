import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int X, N, a, b;
        int result = 0;

        X = scanner.nextInt(); // 구매한 물건의 총 가격
        N = scanner.nextInt(); // 구매한 물건의 총 개수

        for(int i=0; i<N; i++) {
            a = scanner.nextInt(); // 물건의 가격
            b = scanner.nextInt(); // 물건의 개수

            result += a*b; // 영수증에 적힌 총 금액
        }

        if (result == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}