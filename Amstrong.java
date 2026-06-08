import java.util.*;
class Amstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("Amstrong");
        } else {
            System.out.println("Not Amstrong");
        }

    }
}