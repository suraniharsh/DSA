import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(harryPotter(Math.abs(num)));
        sc.close();
    }

    public static int harryPotter(int num){
            return (num%10)+(num/1000);
    }

}