package programmers;

import java.util.Arrays;

public class Quiz12917 {
	public static void main(String[] args) {
		Solution sdf = new Solution();
		Solution2 sdf2 = new Solution2();
		String s = "Zbcdefg";
		System.out.println(sdf.solution(s));
		System.out.println(sdf2.solution(s));
	}
	static class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        char[] str = s.toCharArray();
	        
	        Arrays.sort(str);
	        
	        answer = String.valueOf(str);
	        
	        StringBuffer sb = new StringBuffer(answer);
	        answer = sb.reverse().toString();
	        
	        return answer;
	    }
	}
	
	static class Solution2 {
	    public String solution(String s) {
	        String answer = "";
	        
	        char[] str = s.toCharArray();
	        
	        Arrays.sort(str);
	        
	        answer = new StringBuilder(new String(str)).reverse().toString();
	        
	        return answer;
	    }
	}
	

}
