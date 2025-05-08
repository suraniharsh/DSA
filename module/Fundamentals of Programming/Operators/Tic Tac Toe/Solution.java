import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        if(num <= 9 && num >= 1 ){
            System.out.println((num-1)/3+" "+(num-1)%3);
        }
        
        sc.close();
    }

}