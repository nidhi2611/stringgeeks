package reverseString;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            int p = 0;

            String str = sc.next();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '.') {
                    list.add(str.substring(p, i));
                    p = i + 1;
                }

            }
            for (int j = list.size() - 1; j >= 0; j--) {
                System.out.print(list.get(j) + ".");
            }
        }
    }
}
