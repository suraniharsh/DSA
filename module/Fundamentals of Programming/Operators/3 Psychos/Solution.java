import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();

        System.out.printf("Arun's house is located at(%.1f,%.1f)", (x1+x2)/2, (y1+y2)/2);

        sc.close();
    }

}