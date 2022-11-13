package programmers;

//특정 문자 제거하기
public class Quiz120826 {
	public static void main(String[] args) {
		
		String my_string = "abcdef";
		String letter = "f";
		
		
		// String.replace() 사용
		// 문자열은 char의 배열과 같음.
		for(char a : letter.toCharArray()) {
			my_string = my_string.replace(String.valueOf(a), "");
		}
		System.out.println(my_string);
		
		String my_string2 = "abcdef";
		String letter2 = "f";
		
		my_string2 = my_string2.replace(letter2, "");
		System.out.println(my_string2);
		
		

	}
}
