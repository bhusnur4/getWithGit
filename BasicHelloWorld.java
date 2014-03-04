
public class BasicHelloWorld {
	
	public static void main(String[] args)
	{
		System.out.println("hello world");
		
		BasicHelloWorld b = new BasicHelloWorld();
		b.fancierHelloWorld("f");
	}
	
	public void fancierHelloWorld(String name){
		System.out.println("hello to you " + name);
	}
	
	public static int addTwoAndTwo(){return 2 + 2;}
}
