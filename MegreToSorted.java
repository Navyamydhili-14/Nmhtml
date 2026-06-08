import java.util.ArrayList;

class MegreToSorted {
    public static void main(String[] args) {
        int i = 0, j = 0;
        ArrayList<Integer> arr1 = new ArrayList(Arrays.asList(1, 3, 6, 4, 5));
        ArrayList<Integer> arr2 = new ArrayList(Arrays.asList(1, 3, 6, 4, 5));
        int[] result = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result.add(arr1.get[i]);
                i++;
            } else {
                result.add(arr2.get[j]);
                j++;
            }

        }
        while (i < arr1.size()) {
            result.add(list1.get(i));
            i++;
        }

        while (j < arr2.size()) {
            result.add(list2.get(j));
            j++;
        }

        System.out.println("Merged List: " + result);
    }
}
