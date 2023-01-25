package programmers;

public class Quiz77884 {
	public static void main(String[] args) {
		Solution sdf = new Solution();
		int left = 13;
		int right = 17;
		int result = 43;
		System.out.println(sdf.solution(left, right));
	}

	static class Solution {
		public int solution(int left, int right) {
			int answer = 0;
			// 반복문을 통해 left와 right를 돌린다.
			// 약수를 구하는 공식을 이용해 각각의 약수의 개수를 구한다.
			// 만약 약수의 개수가 짝수면 + 홀수면 -
			
			int cnt = 0;
			for(int i=left; i<= right; i++) {
				for(int j=1; j <= i; j++) {
					if(i % j == 0) {
						cnt++;
					}
				}
				System.out.println(cnt);
				System.out.println("=======");
				if(cnt%2 == 0) {
					answer += i;
				} else if(cnt%2 != 0) {
					answer -= i;
				}
				cnt = 0;
			}
			System.out.println(answer);
			return answer;
		}
	}
}
