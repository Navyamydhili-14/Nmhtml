import java.util.Scanner;

class Arraysum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] = sc.nextInt();
        for (int i =  0 ;  i  < arr .length; i++) {
            sum = sum+arr[i];
        }
        System.out.println(sum);

    }
}