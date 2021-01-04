/*

Enter n : 5

Enter Symbol : @
@    @
 @  @
  @
 @  @
@    @

*/

//Type-1

/*
import java.util.Scanner;
class Main_4 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		System.out.print("Enter n : ");
		int n=sa.nextInt();
		System.out.println();
		System.out.print("Enter Symbol : ");
		String s=sa.next();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==i || j==n-i+1){
					System.out.print(s);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
*/

//Type-2

/*
import java.util.Scanner;
class Main_4
{
	public static void main(String args[]){
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j || i+j==n-1){
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

*/