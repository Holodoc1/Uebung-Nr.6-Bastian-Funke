package p3;
import h3.*;

public class P3_Main {

	public static void main(String[] args) {
		int[] b = {1,-4,-5,4,-2,-4,4,-4,4,-6,-5};
		System.out.println(methode(b));
	}
	
	public static int methode(int[] a) {
		int max = 0;
		max = a[0];
		int i;
		for(i = 0; i < a.length; i++) {
			if(Math.abs(a[i]) > Math.abs(max)) max = a[i]; 
		}
		int max2;
		max2 = -1;
		for(i = 0;i < a.length; i++) {
			if(Math.abs(a[i]) > Math.abs(max2) && Math.abs(a[i]) != Math.abs(max)) max2 = a[i];
		}
		if(H3_Main.zaehlen(a, max2) > 0 && H3_Main.zaehlen(a, -max2) > 0) {
			return Math.abs(max2);
		}
		return max2;
	}
}
