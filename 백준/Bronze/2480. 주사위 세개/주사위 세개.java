import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");

        int A = Integer.parseInt(stringTokenizer.nextToken());
        int B = Integer.parseInt(stringTokenizer.nextToken());
        int C = Integer.parseInt(stringTokenizer.nextToken());

        if (A == B && B == C) {
            System.out.println(10000 + A * 1000);
        } else if (A != B && A != C && B != C) {
            if (A > B && A > C) {
                System.out.println(A * 100);
            } else if (B > A && B > C) {
                System.out.println(B * 100);
            } else {
                System.out.println(C * 100);
            }
        } else {
            if (A == B) {
                System.out.println(1000 + (A * 100));
            } else if (B == C) {
                System.out.println(1000 + (B * 100));
            } else {
                System.out.println(1000 + (C * 100));
            }
        }
    }
}