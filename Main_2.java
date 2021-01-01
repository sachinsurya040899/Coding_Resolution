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
class Main_2 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[3];
		for(int i=0;i<n;i++){
			for(int j=0;j<a.length;j++){
				a[j]=sa.nextInt();
			}
			int a1=a[0];
			int b=a[1];
			int c=a[2];
			int index=1;
			int sum=0;
			for(int k=0;k<c;k++){
				if(k>0){
					sum=sum+(index*b);
					index=index*2;
					if(k==c-1){
						System.out.print(sum);
					}
					else{
						System.out.print(sum+" ");
					}
				}
				else{
					sum=sum+a1+(index*b);
					index++;
					System.out.print(sum+" ");
				}
			}
			System.out.println();
		}
	}
}