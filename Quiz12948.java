package programmers;

public class Quiz12948 {
	public static void main(String[] args) {
		String phone_number = "01033334444";
		
		Solution sdf = new Solution();
		
		System.out.println(sdf.solution(phone_number));
		
		
	}
	static class Solution {
	    public String solution(String phone_number) {
	        String answer = phone_number.substring(phone_number.length()-4);
	        
	        String ans = "";
	        for(int i = 0; i<phone_number.length()-4; i++) {
	        	ans += "*";
	        }
//	        answer = ans.concat(answer);
	        
	        ans += answer;
	        
	        return ans;
	    
	        
//	        return answer;
	    }
	}

}
