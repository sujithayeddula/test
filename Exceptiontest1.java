

public class Exceptiontest1 {
	public static void main(){
		try{
		test1();
		
		}
		catch(Exception e){
				System.out.println("maine");
	         }
		System.out.println("test3");
	}

	
	
	
	public static void test1(){
		try{
			int i=12/0;
		}
		catch(ArithmeticException ae){
		System.out.println("ae");	
		}catch(Exception e){
			System.out.println("e");
		}
	}
	
}
