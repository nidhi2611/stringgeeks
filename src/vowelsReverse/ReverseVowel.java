package vowelsReverse;

import java.util.Scanner;

public class ReverseVowel {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String vowels = "";
            String str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    vowels = vowels + str.charAt(i);
                }
            }
            System.out.println(vowels);
            int l = vowels.length() - 1;
            String day = "";
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o' || str.charAt(j) == 'u') {
                    day = day + vowels.charAt(l);
                    --l;
                } else
                    day = day + str.charAt(j);
            }
            System.out.print(day);
            System.out.println();
        }
    }
}
