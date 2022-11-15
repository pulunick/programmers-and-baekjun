package programmers;

import java.util.ArrayList;
import java.util.List;

public class Quiz120809 {
	public static void main(String[] args) {
		// 배열곱하기
		// 각 배열에 2를 곱한 값을 출력하시오 // 답 : {2, 4, 6, 8, 10}
		int[] numbers = {1, 2, 3, 4, 5};
		
		
		// 배열로 풀기
		int[] answer = new int[numbers.length];
		
		int b = 0;
		for(int a : numbers) {
			answer[b] = a*2;
			b++;
		}
		for(int c : answer) {
			System.out.println(c);
		}
		
		
		//List로 풀기
		List<Integer> answer2 = new ArrayList<Integer>();
		
		for(int num : numbers) {
			answer2.add(num*2);
		}
		System.out.println(answer2);
	}

}
