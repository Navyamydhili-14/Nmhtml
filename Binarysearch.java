import java.util.Scanner;

class Binarysearch {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6, 8, 9}; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the key element");
        int key = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int found = 0;
        while (low <= high) {
            int mid = low + high / 2;
            if (arr[mid] == key) {
                System.out.println("element found is at index " + mid);
                found = 1;
                break;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (found == 0) {
            System.out.println("element not found");
        }

    }
}