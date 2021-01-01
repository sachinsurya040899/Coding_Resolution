/*

Input:
======
5

Output:
=======
    *
   * *
  * * *
 * * * *
* * * * *

*/
import java.util.Scanner;
class Main_1 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int space=n;
		for(int i=0;i<n;i++){
			space--;
			for(int j=0;j<space;j++){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
