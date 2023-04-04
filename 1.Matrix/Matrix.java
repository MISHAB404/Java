import java.util.Scanner;
public class Matrix
{
    public static void main(String[] args) 
    {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        m = sc.nextInt();   
        System.out.print("Enter the number of columns:");
        n = sc.nextInt();
  
            int a[][] = new int[m][n];   
            int b[][] = new int[m][n];    
            int c[][] = new int[m][n];   


            // Store Elements of first matrix
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("");

            // Store Elements of second matrix
            System.out.println("Enter all the elements of second matrix:");
            for (int i=0;i<m;i++) {
                for (int j=0;j<n;j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            System.out.println("");
         
            // Loop to Add 2 matrix
            for (int i=0;i<m;i++) {
                for (int j=0;j<n;j++) {
                        c[i][j] = a[i][j] + b[i][j];
                }
            }

            // Printing the final output
            System.out.println("Matrix after addition:");
            for (int i=0;i<m;i++) {
                for (int j=0;j<n;j++) {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
       
    }
}
