import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The required length is " + perimeter(l, b) + " m");
        System.out.println("The required area of carpet is " + area(l, b) + " sqm");
        sc.close();
    }

    public static int area(int l, int b) {
        if (l > 0 && b > 0) {
            return l * b;
        } else {
            return 0;
        }
    }

    public static int perimeter(int l, int b) {
        if (l > 0 && b > 0) {
            return 2 * (l + b);
        } else {
            return 0;
        }
    }

}