import java.util.*;

class Top3valuesMultiplication {
    public static void main(String[] args) {
        Scanner sc=ne w Scanner(System.in); 
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {     
            arr[i]=sc.nextInt();  
        }
        Arrays.sort(arr);
        int n = arr.length;
        int product1 = arr[n-1] * arr[n-2] * arr[n-3];
        int product2 = arr[0] * arr[1] * arr[n-1];
        int maxProduct = Math.max(product1, product2);
        System.out.println("Maximum product of three numbers: " + maxProduct);
    }

}