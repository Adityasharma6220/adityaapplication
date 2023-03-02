package Pattern;


public class ArrayBarChart {
    static void printChart(int[] arr) {
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i <= arr[j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 5, 0, 7 };
        printChart(arr);
    }
}