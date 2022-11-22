package programmers;

public class Quiz12916 {
	public static void main(String[] args) {
		String s = "sdfd";
		// answer = true;
		Solution sdf = new Solution();
		Solution2 sdf2 = new Solution2();
		
		System.out.println(sdf.solution(s));
		System.out.println(sdf2.solution2(s));
		
	}
	
	// replace로 문자열을 지운 후 길이를 감소시켜 p+P의 전체 길이를 구함.
	static class Solution {
	    boolean solution(String s) {
	        // 둘다 0일때 true 반환 + int형 그릇 만들기.
	        int psum=0;
	        int ysum=0;
	        
	        // 자바는 대소문자를 구분하기 떄문에 대소문자 따로 변수 설정
	        char p = 'p';
	        char p1 = 'P';
	        char y = 'y';
	        char y1 = 'Y';

	        // replace로 특정 문자를 ""로 치환 
	        // String.valueof()를 이용해 char형 String형으로 변환
			psum += s.length() - s.replace(String.valueOf(p), "").length();
			psum += s.length() - s.replace(String.valueOf(p1), "").length();
			
			ysum += s.length() - s.replace(String.valueOf(y), "").length();
			ysum += s.length() - s.replace(String.valueOf(y1), "").length();
			
			if(psum == ysum) {
				return true;
			}else return false;
			
			/* 미흡한 점
			 * 모두 대문자로 치환을 했다면 더 간결한 코드를 만들 수 있었음.
			 * ex) ==> s = s.toUpperCase(); 
			*/
	    }
	}
	static class Solution2 {
	    boolean solution2(String s) {
	    	// 소문자로 치환
	        s = s.toLowerCase();
	        int count = 0;
	        
	        // 간단할 경우 for문이 가장 빠름.
	        for (int i = 0; i < s.length(); i++) {

	            if (s.charAt(i) == 'p')
	            	// count++
	                count++;
	            else if (s.charAt(i) == 'y')
	            	// for문 한번으로 p와 y의 갯수를 모두 뽑아내어 연산이 가능.
	                count--;
	        }

	        if (count == 0)
	            return true;
	        else
	            return false;
	    	
	    }
	}

}
