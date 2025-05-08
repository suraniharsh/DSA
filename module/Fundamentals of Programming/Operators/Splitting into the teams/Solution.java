import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friends = sc.nextInt();
        int sizeOfTeam = sc.nextInt();
        System.out.println(
            "The number of friends in each team is "+ (friends/sizeOfTeam) +" and left out is " + (friends%sizeOfTeam)
        );
        sc.close();
    }

}