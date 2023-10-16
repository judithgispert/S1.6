package N2Ex2;

import java.util.ArrayList;

public class N2Ex2 {

	public static void main (String[]args) {
		
		GenericMixMethods <Object> genMixMet = new GenericMixMethods<Object>();
		
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Mar");
		names.add("Joan");
		names.add("Aria");
		
		ArrayList <Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(9);
		nums.add(36);
		
		
		genMixMet.genMixMethod(names, nums, "Stop");
	}
}
