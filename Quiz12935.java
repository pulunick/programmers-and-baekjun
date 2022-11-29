package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz12935 {
	public static void main(String[] args) {
		int[] arr = {1,2};
		
		Solution2 sdf = new Solution2();
		sdf.solution2(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
		
	}
	
	static class Solution2 {
	    public int[] solution2(int[] arr) {
	    	if(arr.length == 1) {
	    		int[] answer = {-1};
	    		return answer;	
	    	}
	    	int[] answer = new int[arr.length-1];
	    	
	    	int min = arr[0];
	    	for(int i = 0; i < arr.length; i++) {
	    		min = Math.min(min, arr[i]);
	    	}
	    	int index = 0;
	    	
	    	for(int i = 0; i < arr.length; i++) {
	    		if(arr[i] == min) {
	    			continue;
	    		}
	    		
	    		answer[index++] = arr[i];
	    	}

	    	return answer;
	    }
	}
}
