package p2;

public class P2_Main {

	public static void main(String[] args) {
		int[] a = {7,6,8};
		System.out.println(pairwiseDifferent(a));
	}
	
	public static boolean pairwiseDifferent(int[] someNumbers) {
		int i;
		int j;
		for (i = 0; i < someNumbers.length; i++) {
			for(j = 1 + i; j < someNumbers.length; j++) {
				if(someNumbers[i] == someNumbers[j]) return false;
			}
		}
		return true;
	}
}
