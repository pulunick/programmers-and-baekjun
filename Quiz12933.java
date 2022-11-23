package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Quiz12933 {
	public static void main(String[] args) {
		int n = 118372;
		
		Solution4 sdf = new Solution4();
		
		System.out.println(sdf.solution4(n));
		
	}
	
	// 접근 방법 : 내림차순 정렬은 String형으로 쉽게 가능하다.
	static class Solution4 {
	    public long solution4(long n) {
	    	// String 형으로 변환 후 String 배열에 split을 이용해 집어넣는다.
//	    	String s = String.valueOf(n);	    	
//	    	String[] ss = s.toString().split("");
	    	
	    	// 위 코드를 한줄로 표현 가능하다.
	    	String[] ss = String.valueOf(n).split("");
	    	
	    	// Collections.reversOrder()를 이용해 내림차순 정렬
	    	// int형의 경우 Arrays.stream(arr).boxed().toArray(Integer[]::new);을 통해 Integer타입
	    	// 배열로 변경해 줘야 한다.
	    	Arrays.sort(ss, Collections.reverseOrder());
	    	
	    	// StringBuilder의 append를 활용
	    	StringBuilder sb = new StringBuilder();
	    	for(String name : ss) {
	    		sb.append(name);
	    	}
//	    	String str = sb.toString();
	    	
	    	// long형으로 형변환 + toString을 통해 메소드를 재정의
	    	long answer = Long.parseLong(sb.toString());
       
	        return answer;
	    }
	}

}
