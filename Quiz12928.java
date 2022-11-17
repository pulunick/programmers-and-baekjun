package programmers;

public class Quiz12928 {
	public static void main(String[] args) {
		int n = 100;

		Solution6 sum = new Solution6();

		System.out.println(sum.solution6(n));
	}
	static class Solution6 {
		public int solution6(int n) {
			int answer = 0;

			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					answer += i;
				}
			}
			return answer;
		}
	}
	// 효용성 좋은 다른 풀이
	static class Solution7 {
		public int solution7(int n) {
			int answer = 0;

			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0) {
					answer += i;
				}
			}
			return answer + n;
		}
	}
}
