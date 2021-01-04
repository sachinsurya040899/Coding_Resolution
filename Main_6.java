/*

Input:
======
5

Output:
=======
*   *
 * *
  *
 *
*

*/
import java.util.Scanner;
class Main_6 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int div=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if((j==i && j<=div) || (j==n-i+1)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}