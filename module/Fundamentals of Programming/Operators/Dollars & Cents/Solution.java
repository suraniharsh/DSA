import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aDollar = sc.nextInt();
        int aCents = sc.nextInt();
        int bDollar = sc.nextInt();
        int bCents = sc.nextInt();

        int dollar = aDollar+bDollar;
        int cents = (aCents+bCents);
        if (cents > 100) {
            cents -= 100;
            dollar += 1;
        }

        System.out.println(dollar);
        System.out.println(cents);

        sc.close();
    }

}