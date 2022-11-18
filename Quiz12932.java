package programmers;

public class Quiz12932 {
	public static void main(String[] args) {
		long n = 12345;
		Solution10 m = new Solution10();
		Solution11 d = new Solution11();
		
		for(int s : m.solution10(n)) {
			System.out.print(s);
		}
		System.out.println();
		
		for(int s : d.solution11(n)) {
			System.out.print(s);
		}
		
	}
	
	static class Solution10 {
	    public int[] solution10(long n) {
	    	// valueOf로 변환
	        String s = String.valueOf(n);
	        // StringBuilder 메소드를 쓸것이기에 선언.
	        StringBuilder sb = new StringBuilder(s);
	        // String 메소드 reverse()로 뒤집어줌
	        sb = sb.reverse();
	        // split을 이용해 배열로 만들어준다.
	        String[] ss = sb.toString().split("");
	        // 확인작업
//	        for(String sd : ss) {
//	        	System.out.print(sd);
//	        }
//	        System.out.println();
	        
	        
	        // int[] 배열의 길이는 string[] 배열의 길이이다.
	        int[] answer = new int[ss.length];
	        // 형변환하여 answer에 넣어준다.
	        for (int i=0; i<ss.length; i++) {
	            answer[i] = Integer.parseInt(ss[i]);
	        }
	        return answer;
	    }
	}
	
	static class Solution11 {
		public int[] solution11(long n) {
			// long형은 바로 String 형에 박을려면 ""+ long형변수;
			String str = ""+ n;	
			
			//int[] 배열의 길이는 string[] 배열의 길이이다.
			int[] answer = new int[str.length()];
			//인덱스 그릇 생성
			int sd = 0;
			
			//뒤집어서 넣어야하기에 나머지를 반환하여 answer[]에 넣어준다.(인덱스는 ++)
			while(n != 0) {
				answer[sd] = (int) (n%10);
				n /= 10;
				sd++;
			}
			return answer;
		}
	}

}
