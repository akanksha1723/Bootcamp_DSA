import java.util.*;
public class NegateandReverserow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<matrix.length; i++){
            if(i % 2 == 0) {
                for(int j=0; j<matrix[i].length; j++){
                    matrix[i][j] = -matrix[i][j];
                }
            }
            
        }
        int start = 0;
        int end = matrix.length - 1;
        while (start < end) {
            int[] temp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = temp;
            start++;
            end--;
        }
        System.out.println("Negated and Reversed Row Matrix:\n");
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();   
        }   
        sc.close();
    }
}
