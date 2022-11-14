package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz120833 {
	public static void main(String[] args) {
		// 배열 numbers에서 num1번째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 출력하세요.
		int[] numbers = { 1, 7, 3, 8, 9, 5 };
		int num1 = 2;
		int num2 = 4;
	
		
		//새로운 배열을 만들어 배열의 크기를 지정해준다.//인덱스는 0부터 시작하기에 +1을 해준다.
		int[] numbers2 = new int[num2 - num1 + 1];
		//새로운 배열의 인덱스 초기값 지정
		int index = 0;
		//for(시작=num1; 종료시점=num2(num2번째 인덱스까지 출력해야한다); 반복할때마다 ++)
		for (int i = num1; i <= num2; i++) {
			numbers2[index] = numbers[i];
			System.out.println(numbers2[index]);
			index++;
		}
		System.out.println();
		
		
		//Arrays.copyOfRange() 는 특정 배열의 원하는 범위만큼 복사하여 새로운 배열을 만드는 메소드
		//새로운 배열 = Arrays.copyOfRange(원본 배열, 복사하려는 시작 요소의 인덱스,
		int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
		for(int a : answer) {
			System.out.println(a);
		}
		
		System.out.println();
		
		//List로 변환
		//List 그릇을 만들어주고 List그릇에 배열을 쏟아부움.
		List<Integer> list = new ArrayList<Integer>();
		for(int i = num1; i<=num2; i++) {
			list.add(numbers[i]);
		}
		
		//확장 for문으로 뽑기
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println();
		
		//람다식으로 뽑기
		list.forEach(s -> System.out.println(s));
		System.out.println();
		
		//메소드 참조(::)로 뽑기
		list.forEach(System.out::println);
	
	}

}

