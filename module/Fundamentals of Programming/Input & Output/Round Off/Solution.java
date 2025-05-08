import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        System.out.println((int)Math.floor(number));
        System.out.println((int)Math.ceil(number));
        System.out.println((int)Math.floor(number));
        sc.close();
    }
}