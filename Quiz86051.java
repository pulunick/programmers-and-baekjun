package programmers;

public class Quiz86051 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		
		Solution sdf = new Solution();
		
		System.out.println(sdf.solution(numbers));
		
	}
	
	static class Solution {
	    public int solution(int[] numbers) {
	        int answer = 45;
	        
	        for(int i = 0; i < numbers.length; i++) {
	        	answer -= numbers[i];
	        }
	        return answer;
	    }
	}

}
