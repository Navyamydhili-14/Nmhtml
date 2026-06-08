import java.util.*;

class Palindrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 0, temp = num;
        while (temp > 0) {
            int reminder = temp % 10;
            sum = sum * 10 + reminder;
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println("palindrome");
        } else {
            System.out.println(" not a palindrome");

        }
    }
}