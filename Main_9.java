/*

if n is odd then print hello
if n is even and 
print hi when n value is 0 to 10
print hello when n value is 10 to 20
print bye when n value is above 20

Input:
======
20

Output:
=======
Hello

*/
import java.util.Scanner;
class Main_9
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		if(n%2!=0){
			System.out.print("Hello");
		}
		else if(n%2==0 && n>=0 && n<=10){
			System.out.print("Hi");
		}
		else if(n%2==0 && n>10 && n<=20){
			System.out.print("Hello");
		}
		else if(n%2==0 && n>20){
			System.out.print("Bye");
		}
	}
}
