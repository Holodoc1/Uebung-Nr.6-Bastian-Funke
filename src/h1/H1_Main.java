package h1;

public class H1_Main {

	public static void main(String[] args) {
		int[] a = {2,4,6};
		int[] b = {6,4,2};
		System.out.println("Die Arrays sind spiegelbildlich zueinander: " + isMirrorArray(a,b));
	}
	
	public static boolean isMirrorArray(int[] a, int[] b) {
		int i;
		if(a.length == b.length) {
			for(i = 0; i < a.length; i++) {
				if(a[i] != b[a.length - 1 - i]) return false;
			}
			return true;
		}
		return false;
	}
}
