package N2Ex1;

public class N2Ex1 {

	public static void main (String[]args) {
		
		MixMethods<Object> mixM = new MixMethods<Object>();
		
		System.out.println(mixM.genMixMethod("Hello", 21, "Hi"));
		System.out.println(mixM.genMixMethod(23.9, new Person ("Julia", 26), "Sun"));
		
		
	}
}
