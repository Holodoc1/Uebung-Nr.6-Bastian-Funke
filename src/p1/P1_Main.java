package p1;

public class P1_Main {

	public static void main(String[] args) {
		int a = 7;
		System.out.println(squared(a));
	}
	
	public static int squared(int zahl) {
		zahl += 1;
		return zahl * zahl;
	}
}
