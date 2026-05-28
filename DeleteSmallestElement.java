import java.util.*;
public class DeleteSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest Element: " + min);
        System.out.println("Array after deleting the smallest element:");
        for (int i = 0; i < n; i++) {
            if (arr[i] != min) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
