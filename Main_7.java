/*

Input:
======
5

Output:
=======
1 2 3 4 5
      4
    3
  2
1 2 3 4 5

*/
import java.util.Scanner;
class Main_7 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 || i==n || j==n-i+1){
					System.out.print(j+" ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}