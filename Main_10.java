/*

Input:
======
5

Output:
=======
    *
   *  *
  ******
 *      *
*        *

*/
import java.util.Scanner;
class Main_10 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n*2;j++){
				if(j==n-i+1 || j==n+i-1 && i>1){
					System.out.print("*");
				}
				if(i==n/2+1 && j>=n-i+1 && j<n+i-1){
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