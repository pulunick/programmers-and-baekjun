package programmers;

import java.util.ArrayList;
import java.util.List;

public class Quiz120813 {
	public static void main(String[] args) {
		int n = 10;
		Solution sdf = new Solution();
		
		sdf.solution(n);
		
		for(int a : sdf.solution(n)) {
			System.out.println(a);
		}
	}
	
	static class Solution {
	    public int[] solution(int n) {
	    	List<Integer> answer = new ArrayList<Integer>();
	    	for(int i=0; i <= n; i++) {
	    		if(i % 2 != 0) {
	    		answer.add(i);
	    		}
	    	}
	    	// 전통적인 방법의 list -> array 변환
//	    	int[] answer = new int[list.size()];
//	    	for(int i =0; i < list.size(); i++) {
//	    		answer[i] = list.get(i);
//	    	}
	    	// stream API (JAVA8 이상)
	        return answer.stream().mapToInt(a -> a).toArray();
	    }
	}

}
