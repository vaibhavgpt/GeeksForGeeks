package techgig;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NoOfMatches {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int no = Integer.parseInt(br.readLine());
        while (no-- > 0) {
            int teams = Integer.parseInt(br.readLine());
            int matches = 0;
            while (teams > 1) {
                System.out.println("teams  = " + teams);

                matches = matches + teams / 2;
                System.out.println("matches  = " + matches);

                if (teams % 2 != 0) {
                    matches = matches + 1;
                }
                teams = teams / 2;
            }
            System.out.println(matches);
        }

    }
}
