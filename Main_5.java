/*

Input:
======
3
-150
20000
243333333333333333333333333

Output:
=======
-150 can be fitted in:
-150 short
-150 int
-150 long
20000 can be fitted in:
20000 short
20000 int
20000 long
243333333333333333333333333 can't be fitted anywhere

*/
import java.util.Scanner;
class Main_5 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		for(int i=0;i<n;i++){
			try{
				long t=sa.nextLong();
				System.out.println(t+" can be fitted in:");
				if(t>=-128 && t<=127){
					System.out.println(t+" byte");
				}
				if(t>=-32768 && t<=32767){
					System.out.println(t+" short");
				}
				if(t>=-2147483648 && t<=2147483647){
					System.out.println(t+" int");
				}
				if(t>=-9223373e18 && t<=9223372e17){
					System.out.println(t+" long");
				}
			}
			catch(Exception e){
				System.out.println(sa.next()+" can't be fitted anywhere");
			}
		}
	}
}