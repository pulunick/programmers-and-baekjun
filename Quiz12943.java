package programmers;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12943
public class Quiz12943 {
	public static void main(String[] args) {
		int n = 626331;
		Solution10 sdf = new Solution10();
		
		System.out.println(sdf.solution10(n));
		
	}

	static class Solution10 {
		public int solution10(int num) {
			int answer = 0;
			long n = num;
			if (n == 1) {
				return 1;
			}
			while (n <= 500) {
				if (n == 1) {
					return answer;
				}
				if (n % 2 == 0) {
					n /= 2;
				} else {
					n = (n * 3) + 1;
				}
				answer++;
			}

			return -1;
		}
	}

}
