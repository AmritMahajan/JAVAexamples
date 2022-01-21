package sample;


public class casting {

	public static void main(String[] args) {
		Parent p = new Child();
		p.name="Arun";
		Child c =(Child) p;
		System.out.println(c.name);
		
		//wrong way to downcast
		/*Child c2 =new Parent();
		c2.name="Ajay";
		*/

	}

}
