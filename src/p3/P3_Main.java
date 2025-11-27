package p3;

public class P3_Main {

	public static void main(String[] args) {
		int[] b = {10,101,6,9,6,99};
		System.out.println(methode(b));
	}
	
	public static int methode(int[] a) {
		int maxAbs = -1;
		int max2 = -1;
		int maxWert = 0;
		int k = a.length;
		maxAbs = Math.abs(a[0]);
		maxWert = a[0];
		for(int i = 1; i < k; i++) {
			int temp;
			if(Math.abs(a[i]) > maxAbs) {
				temp = maxWert;
				maxAbs = Math.abs(a[i]);
				maxWert = a[i];
				max2 = temp;
			}
		}
		return max2;
	}
}
