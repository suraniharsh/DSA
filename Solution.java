import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a  = sc.nextInt();
        int arr1[] = new int[a];
        
        int b = sc.nextInt();
        int arr2[] = new int[b];

        System.out.println(isCompatible(arr1, arr2));


        sc.close();
    }

    public static boolean isCompatible(int arr1[], int arr2[]){
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[i] > arr2[i]) {
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }

}