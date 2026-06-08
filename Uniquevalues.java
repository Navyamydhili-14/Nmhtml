import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

class Uniquevalues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (!set.contains(num)) {
                set.add(num);
                list.add(num);
            }
        }

        System.out.println("Unique values are:");
        for (int value : list) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}