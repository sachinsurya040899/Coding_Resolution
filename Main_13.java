/*

Create one object to call all types of constructor

*/
class Main_13 
{
	Main_13(){
		this(1);
		System.out.println("No-Parameter Constructor");
	}
	Main_13(int a){
		this(1,2);
		System.out.println("Integer-Parameter Constructor");
	}
	Main_13(int a,int b){
		this(1,"sachin");
		System.out.println("Integer and Integer-Parameter Constructor");
	}
	Main_13(int a,String s){
		System.out.println("Integer and String-Parameter Constructor");
	}
	public static void main(String[] args) 
	{
		Main_13 s=new Main_13();
	}
}
