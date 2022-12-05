package programmers;

public class Quiz76501 {
	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		
		Solution sdf = new Solution();
		
		System.out.println(sdf.solution(absolutes, signs));
	}

	
	static class Solution {
	    public int solution(int[] absolutes, boolean[] signs) {
	        int answer = 0;
	        
	        int p = 0;
	        for(int i = 0; i < absolutes.length; i++) {
	        	if(signs[i] == true) {
	        		answer += absolutes[p];
	        		p++;
	        	}
	        	if(signs[i] == false) {
	        		answer += absolutes[p] * -1;
	        		p++;
	        	}
	        }
	        return answer;
	    }
	}
}
// 위 코드를 더 깔끔하게 삼항으로 할 시.
//int answer = 0;
//for (int i=0; i<signs.length; i++)
//    answer += absolutes[i] * (signs[i]? 1: -1);
//return answer;