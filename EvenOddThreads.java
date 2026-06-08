import java.util.Scanner;

class EvenThread extends Thread {
    private int limit;

    EvenThread(int limit) {
        this.limit = limit;
    }

    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 2; i <= limit; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class OddThread extends Thread {
    private int limit;

    OddThread(int limit) {
        this.limit = limit;
    }

    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        EvenThread even = new EvenThread(limit);
        OddThread odd = new OddThread(limit);

        even.start();
        odd.start();

        sc.close();
    }
}