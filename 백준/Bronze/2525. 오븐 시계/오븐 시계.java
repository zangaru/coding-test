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
        int C = Integer.parseInt(reader.readLine());

        int toMin = 60 * A + B;
        toMin += C;

        int hour = (toMin / 60) % 24;
        int min = toMin % 60;

        System.out.println(hour + " " + min);
    }
}