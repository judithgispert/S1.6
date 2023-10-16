package N2Ex2;

import java.util.List;

public class GenericMixMethods <T> {

	public GenericMixMethods () {
		
	}
	
	public void genMixMethod (List<?> list1, List<?> list2, String str3) {
		
		System.out.println(list1 + " - " + list2 + " - " + str3 + ".");
	}
	
}
