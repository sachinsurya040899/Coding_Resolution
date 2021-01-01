/*

Input:
======
2
0 2 10
5 3 5

Output:
=======
2 6 14 20 62 126 254 510 1022 2046
8 14 26 50 98

Explaination:
=============
with first array
a=a[0],b=a[1],c=a[2]
s=a+1*b
s=a+1*b+2*b
s=a+1*b+2*b+4*b
s=a+1*b+2*b+4*b+8*b
.
.
.
.
till c

with second array
a=a[0],b=a[1],c=a[2]
s=a+1*b
s=a+1*b+2*b
s=a+1*b+2*b+4*b
s=a+1*b+2*b+4*b+8*b
.
.
.
.
till c

*/
import java.util.Scanner;
class Main_3
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int t=sa.nextInt();
		for(int i=0;i<t;i++){
			int a=sa.nextInt();
			int b=sa.nextInt();
			int n=sa.nextInt();
			for(int j=0;j<n;j++){
				a+=b;
				if(j>0){
					System.out.print(" ");
				}
				System.out.print(a);
				b=b*2;
			}
			System.out.println();
		}
	}
}
