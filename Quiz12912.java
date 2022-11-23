package programmers;

public class Quiz12912 {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		Solution6 ans = new Solution6();
		Solution7 anss = new Solution7();
		
		System.out.println(ans.solution6(a, b));
		System.out.println(anss.solution7(a, b));
		
		
		
	}
	
	static class Solution6 {
	    public long solution6(int a, int b) {
	        long answer = 0;
	        
	        if(a > b) {
	        	for(long i=b; i <= a; i++) {
	        		answer += i;
	        	}       	
	        }else {
	        for(long i=a; i <= b; i++) {
	        	answer += i;
	        }
	        }
	        return answer;
	    }
	}
	static class Solution7 {
		public long solution7(int a, int b) {
			// for문 안에 삼항연산자 가능
		      long answer = 0;
		      for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) 
		          answer += i;

		      return answer;
		}
	}
	
	static class Solution8 {
		public long solution8(int a, int b) {
			// 가장 작은 수 Math.min(변수, 변수) 가장 큰 수 Math.max
			return sumAtoB(Math.min(a, b), Math.max(b, a));
		}
			// a는 가장 작은 수 b는 가장 큰 수
		    private long sumAtoB(long a, long b) {
		    	//등차수열의 합 공식
		        return (b - a + 1) * (a + b) / 2;
		}
	}
}
