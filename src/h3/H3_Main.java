package h3;

public class H3_Main {

	public static void main(String[] args) {
		int[] a = {2,5,0,11,8,9,33,22,0,-1};
		int[] b = {2,5,8,9,0,11,-1,22,33,0};
		System.out.println("Die Arrays haben die gleichen Werte: " + compareArraysVal(a,b));
	}
	
	public static boolean compareArraysVal(int[] a, int[] b) {
		int i;
		if(a.length == b.length) {
			for(i = 0; i < a.length; i++) {
				if(zaehlen(a,a[i]) != zaehlen(b,a[i])) return false;
			}
			return true;
		}
		return false;
	}
	
	public static int zaehlen(int[] a, int b) {
		int i;
		int anzahl;
		anzahl = 0;
		for(i = 0; i < a.length; i++) {
			if(a[i] == b) anzahl++; 
		}
		return anzahl;
	}
}
