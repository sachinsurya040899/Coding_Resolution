/*

find area of parellogram
if b and h anyone is less than 0 then,
print java.lang.Exception: Breadth and height must be positive

else
print the area of the parellogram

Input:
======
1
3

Output:
=======
3

Input:
======
-1
2

Output:
=======
java.lang.Exception: Breadth and height must be positive

*/

// One Method

/*
import java.util.Scanner;
class Main_11 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int b=sa.nextInt();
		int h=sa.nextInt();
		if(b>0 && h>0){
			int area=h*b;
			System.out.print(area);
		}
		else{
			System.out.print("java.lang.Exception: Breadth and height must be positive");
		}
	}
}
*/


// Next Method

/*

import java.util.Scanner;
class Main_11
{
	static int b,h,a;
	static{
		try{
			Scanner sa=new Scanner(System.in);
			b=sa.nextInt();
			h=sa.nextInt();
			sa.close();
			if(b<=0 || h<=0){
				throw new Exception("Must be a positive number");
			}
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	public static void main(String args[]){
			a=b*h;
			System.out.print(a);
	}
}

*/