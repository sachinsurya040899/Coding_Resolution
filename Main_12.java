/*

generate 20 random numbers inbetween 100 to 200

*/
import java.util.Random;
class Main_12 
{
	public static void main(String[] args) 
	{
		Random ran=new Random();
		int count=0;
		while(true){
			int n=ran.nextInt(200);
			if(n>=100 && n<=200 && count<=20){
				count++;
				System.out.println(n);
			}
			else if(count>=20){
				break;
			}
		}
	}
}
