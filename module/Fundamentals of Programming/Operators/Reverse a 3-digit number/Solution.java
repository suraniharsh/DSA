import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(reverse(num));
        
        sc.close();
    }

    public static int reverse(int num){
        return (num%10)*100 + ((num/10)%10)*10 + num/100;
    } 

}