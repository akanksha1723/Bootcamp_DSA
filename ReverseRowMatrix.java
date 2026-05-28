import java.util.*;
public class ReverseRowMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i < matrix.length; i++){
            int start = 0;
            int end = matrix[i].length - 1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();   
        }   
        sc.close();
    }
}
