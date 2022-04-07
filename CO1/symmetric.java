
import java.util.*;
public class symmetric {
	static int r,c;

	public static void main(String[] args) {
		int i,j;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the row");
		r=scanner.nextInt();
		System.out.println("Enter the column");
		c=scanner.nextInt();
		int a[][]=new int[r][c];
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				a[i][j]=scanner.nextInt();
			}
		}
		
		int x=1;
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				if(a[i][j]!=a[j][i])
				{
					x=0;
				}
			}
		}
		if(x==1) {
			System.out.println("The matrix is symmetric");
		}
		else {
			System.out.println("The matrix is not symmetric");
		}
		
	}

}