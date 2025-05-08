import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = 3;
        float y2 = 4;

        System.out.println((int)Math.sqrt(sqr(x1-x2) + sqr(y1-y2)));

        sc.close();
    }

    public static float sqr(float num){
        return num*num;
    }

}