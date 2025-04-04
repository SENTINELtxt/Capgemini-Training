package InheritenceTypes;
 
public class Matrix {
    
    
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        
        boolean[] rows = new boolean[m];
        boolean[] column = new boolean[n];

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    column[j] = true;
                }
            }
        }

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] || column[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

   
    public static void main(String[] args) {
        
        Matrix Obj = new Matrix();

        
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}};
        

        
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        
        Obj.setZeroes(matrix);

        
        System.out.println("Matrix after setting z+eroes:");
        printMatrix(matrix);
    }

    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
