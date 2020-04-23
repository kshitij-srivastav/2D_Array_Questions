import java.util.Scanner;

public class transpose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows in the square matrix");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
			b[j][i]=a[i][j];
		}
	    }
		System.out.println("The Matrix before");
	    
		for(int k[]: a) {
			for( int d :k)
			{
				System.out.print(" "+ d);
			}
			System.out.println();
		}
		System.out.println("The matrix after Transpose\n");
		
		for(int k[]: b) {
			for( int d :k)
			{
				System.out.print(" "+ d);
			}
			System.out.println();
		}
		
		
	}
}
