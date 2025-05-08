import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float principalAmount = sc.nextFloat();
        float rateOfInterest = sc.nextFloat();
        float numberOfYears = sc.nextFloat();

        float interest = (principalAmount*rateOfInterest*numberOfYears)/100;
        float amount = interest+principalAmount;
        float discount = (interest*2)/100;
        float finalSettlement = amount-discount;

        System.out.printf("%.2f\n", interest);
        System.out.printf("%.2f\n",amount);
        System.out.printf("%.2f\n",discount);
        System.out.printf("%.2f\n",finalSettlement);
        sc.close();
    }

}