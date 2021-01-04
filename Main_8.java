/*

Input:
======
hello world
I am sachinsurya
how are you?

Output:
=======
1 hello world
2 I am sachinsurya
3 how are you?

*/
import java.util.Scanner;
import java.util.ArrayList;
class Main_8 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		ArrayList ar=new ArrayList();
		boolean flag=true;
		int in=0;
		while(flag){
			String str=sa.nextLine();
			if(str.equals("")){
				flag=false;
			}
			else{
				ar.add(str);
			}
		}
		for(int i=1;i<=ar.size();i++){
			System.out.println(i+" "+ar.get(in));
			in++;
		}
	}
}