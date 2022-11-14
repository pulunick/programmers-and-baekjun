package programmers;

public class Quiz120841 {
	public static void main(String[] args) {
		int[] a = {3,2};
		int[] b = {-3,2};
		int[] c = {-3,-2};
		int[] d = {3,-2};
		// a = 1
		// b = 2
		// c = 3
		// d = 4
		
		
		// for문을 이용하여 인덱스를 직접 비교하여 각 사분면 비교
		for(int i = 0; i < a.length; i++) {
			if(a[0] > 0 && a[1] > 0) {
				System.out.println("1");
				break;
			}
			if(a[0] < 0 && a[1] > 0) {
				System.out.println("2");
				break;
			}
			if(a[0] < 0 && a[1] < 0) {
				System.out.println("3");
				break;
			}
			if(a[0] > 0 && a[1] < 0) {
				System.out.println("4");
				break;
			}
		}

	}

}
