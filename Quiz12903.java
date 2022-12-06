package programmers;

import java.util.ArrayList;
import java.util.List;

public class Quiz12903 {
	public static void main(String[] args) {
		String s = "abde";
		
		Solution sdf = new Solution();
		
		System.out.println(sdf.solution(s));
		
	}
	
	static class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        String[] str = s.split("");
	        if(str.length%2 == 0) {
	        	answer += str[str.length/2 -1] + str[str.length/2];
	        }else {
	        	answer = str[(str.length-1)/2];
	        }

	        return answer;
	    }
	}

}
