import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        System.out.println("Rs."+(int)Math.floor(electricityBill(num)));
        sc.close();
    }

    public static double electricityBill(int num){
        if (num <=200) {
            return num*0.5;
        }else if (num <= 400 && num > 200) {
            return (num*0.65)+100;
        } else if (num <= 600 && num > 400) {
            return (num*0.80)+200;
        }else{
            return (num*1.25)+425; 
        }
    }

}
