import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int goldCoine = sc.nextInt();
        int bensShare = sc.nextInt();
        int blackbeardsShare = sc.nextInt();

        bensShare = (bensShare*goldCoine)/100;
        goldCoine -= bensShare;
        blackbeardsShare = (blackbeardsShare*goldCoine)/100;
        goldCoine -= blackbeardsShare;
        int piratesShare = goldCoine/3;

        System.out.println(bensShare);
        System.out.println(blackbeardsShare);
        System.out.println(piratesShare);

        sc.close();
    }

}