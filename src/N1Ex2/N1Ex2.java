package N1Ex2;

public class N1Ex2 {
	
	public static void main (String[]args) {
		
		GenericMethods<Object> genericMethods = new GenericMethods<Object>();
		
		System.out.println(genericMethods.genMethod(new Person ("Marta", "Ruiz", 22), "Hello", 97));
		System.out.println(genericMethods.genMethod("Hi", new Person ("Albert", "Perez", 11), 14562));
	}

}
