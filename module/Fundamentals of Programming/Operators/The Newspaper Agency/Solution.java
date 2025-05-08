import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(theNewspaperAgency(a, b, c));
        sc.close();
    }

    public static int theNewspaperAgency(int a, int b, int c) {
        if (a >= 0 && b >= 0 && c >= 0) {
            return ((a * b) - (a * c) - 100);
        } else {
            return 0;
        }
    }

}