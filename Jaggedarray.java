import java.util.Scanner;
public class Jaggedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();
        int arr[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
        } 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter value for arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nJagged Array Elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
