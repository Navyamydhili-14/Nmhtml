import java.util.Scanner;

class Membership {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bill = s.nextInt();
        String membership = s.next();
        if (bill > 1000 && membership.equals("yes")) {
            System.out.println("20% discount");
        } else if (bill <= 1000 && membership.equals("n0")) {
            System.out.println("10% discount");

        } else {
            System.out.println("no discount");
        }
    }
}
