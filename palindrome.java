import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int i = 0, j = n - 1;
        boolean ans = true;
        while (i <= j) {
            char a = str.charAt(i);
            char b = str.charAt(j);

            if (a != b)
                ans = false;
            i++;
            j++;
        }

        if (ans == true) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }

    }
}