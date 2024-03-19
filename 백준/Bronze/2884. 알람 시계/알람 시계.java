import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");

        int H = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        if(M >= 45) {
            System.out.println(H + " " + (M-45));
        } else {
            if (H == 0) {
                H = 23;
                System.out.println(H + " " + (M+15));
            } else {
                System.out.println((H-1) + " " + (M+15));
            }
        }
    }
}