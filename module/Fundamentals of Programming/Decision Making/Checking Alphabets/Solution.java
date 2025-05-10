import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ch = sc.nextLine();

        if ("aeiou".contains(ch.toLowerCase())) {
            System.out.println("Vowel");
        } else if (ch.charAt(0) >= 'a' && ch.charAt(0) <= 'z' || ch.charAt(0) >= 'A' && ch.charAt(0) <= 'Z') {
            System.out.println("Consonant");
        } else {
            System.out.println("Not an alphabet");
        }

        sc.close();
    }

}