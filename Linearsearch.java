import java.util.Scanner;

class Linearsearch {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 35, 30, 50, 60 };
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the key element");
        int key = sc.nextInt();
        int found = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("element found at position" + i);
                found = 1;
                break;
            }
        }
        if (found == 0) {
            System.out.println("element not found");
        }
    }

}