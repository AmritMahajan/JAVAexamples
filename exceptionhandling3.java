/*
 * Create 3 methods method1,2,3 
 * THROW A nullpointerEXCEPTION in method 3 and do not handle the exception in method3 hand it to the next method calling it (method2).
 * In method2, make a call to method 3
 * method 1 =main method , call method 2,throw Filenotfound exception
 *  
 */
package sample;
class FileNotFoundException extends Exception {
}
public class exceptionhandling3 {
	void method3() {
		throw new NullPointerException();
	}
	void method2() {
		method3();
	}
	public static void main(String[] args) {
		exceptionhandling3 eh =new exceptionhandling3();
		try {
		eh.method2();
		throw new FileNotFoundException();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
