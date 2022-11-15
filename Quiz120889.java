package programmers;

import java.util.Arrays;

public class Quiz120889 {
	public static void main(String[] args) {
		//삼각형의 완성조건
		//가장 큰 변이 나머지 변을 합친 수보다 작아야 삼각형이 만들어진다.
		//삼각형이 만들어지는 배열이라면 1, 만들어지지않는다면 2를 출력.
		
		int[] sides = {1, 2, 3};
		// result 2
		// int[] sides = {199, 72, 22] => result 1
		
		//<정렬을 이용한 날먹 풀이>
		//삼각형은 배열이 무조건 3개만 존재한다.
		Arrays.sort(sides);
		
		//가장 큰 인덱스는 2 고정이므로, 나머지 인덱스 0과 1을 더했을 때 인덱스 2가 크거나 같다면  2를 출력
		//그렇지 않을 경우 1를 출력
		if(sides[2] >= sides[0] + sides[1]) {
			System.out.println(2);
		}else System.out.println(1);
		//삼항 연산자 이용가능. if(sides[2] >= sides[0] + sides[1]) ? 2 : 1;
		
		
		
		
		//정석 풀이
		// max 그릇과 max그릇일때의 인덱스를 담을 그릇을 만들어준다.
		int index = 0;
		int max = 0;
		
		// for문을 이용해 가장 큰수와 가장 큰수에 해당하는 sides의 인덱스를 뽑아준다.
		for(int i = 0; i < sides.length; i++) {
			if(sides[i] > max) {
				max = sides[i];
				index = i;
			}
		}
		
		// sum 그릇을 만들어준다.
		int sum = 0;
		// for문을 이용해 가장 큰 수를 제외한(이때 앞에 가장 큰수에 해당하는 인덱스를 이용) 
		// 모든 수를 더한 값을 sum에 넣어준다.
		for(int i = 0; i < sides.length; i++) {
			if(i != index) sum += sides[i];
		}
		
		// 만약 합이 max보다 크면 1을 출력 아닐경우 2를 출력한다.
		if(sum>max) {
			System.out.println(1);
		}else
			System.out.println(2);
	}

}
