package generics.watercolors;

import java.util.EnumSet;
import java.util.Set;

import static net.mindview.util.Sets.*; 
import static generics.watercolors.Watercolors.*; 

public class WatercolorSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Watercolors> set1 = 
		EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
		Set<Watercolors> set2 =
		EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER); 
		System.out.println("setl:" + set1); 
		System.out.println("set2:" + set2);
		System.out.println("union(set1, set2):"  + union(set1,set2));
		Set<Watercolors> subSet = intersection(set1,set2);
		System.out.println("intersection(set1,set2): " + subSet); 
		System.out.println("d1fference(set1, subSet): " + difference(set1 ,subSet));
		System.out.println("difference(set2, subset): " + difference(set2 ,subSet)); 
		System.out.println("complement(set1, set2):"+ complement(set1, set2));

	}

}
