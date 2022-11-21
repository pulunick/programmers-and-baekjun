package programmers;

public class Quiz12934 {
	public static void main(String[] args) {
		int n = 1;
		Solution12 kim = new Solution12();
		Solution13 ki = new Solution13();
		
		System.out.println(kim.solution12(n));
		System.out.println(ki.solution13(n));
		
	}
	
	//Math 함수를 이용해서 풀이(이 함수가 일반적 풀이보다 훨씬 빠르다.)
	static class Solution12 {
	    public long solution12(long n) {
	    	//제곱근을 구하는 Math 함수 = sqrt 
	    	//Math함수는 Dobule형 이므로 long형으로 형변환
	        long ans = (long) Math.sqrt(n);
	        long answer = 0;
	        
	        // long형으로 변환 시 반올림이 되므로 값을 곱했을때 제곱근 값이 나오지 않는다.
	        if(ans * ans == n) {
	        	answer = (ans+1)*(ans+1);
	        } else
	        	return -1;
	        
	        
	        return answer;
	    }
	}
	
	//일반적 풀이. 
	static class Solution13 {
	    public long solution13(long n) {
	    	// 1도 포함하기 위함 
	    	// 속도를 위해서 1을 따로 빼는 것도 고려
	    	// if(n==1) { return 4}
	        for(long i=1;i<=n;i++){
	        	// 제곱근은 같은 수의 곱이므로 i로 나눔.
	        	// ++ 나머지가 0이어야 함 딱맞아떨어져야함.
	            if(n/i == i && n%i ==0){
	                return (i+1)*(i+1);
	            }
	        }
	        return -1;
	    	
	    }
	}
	

}
