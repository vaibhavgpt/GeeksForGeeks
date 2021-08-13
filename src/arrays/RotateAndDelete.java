package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateAndDelete {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        System.out.println("t---->" + t);

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println("n---->" + n);
            String[] arr = br.readLine().trim().split(" ");
            ArrayList<Integer> array = new ArrayList<>();
            for(String str: arr){
                array.add(Integer.parseInt(str));
            }

            System.out.println(array);

            int i = 1;
            while (array.size() > 1) {
                Collections.rotate(array, 1);

                int size = array.size();
                if (i <= size)
                    array.remove(size - i);
                else
                    array.remove(0);
                i++;
                System.out.println(array);

            }
            System.out.println("final: " + array.get(0));

        }
    }
}
