import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        printPattern(num);

        sc.close();
    }
     
    public static void printPattern(int num)
    {
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

}