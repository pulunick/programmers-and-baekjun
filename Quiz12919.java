package programmers;

public class Quiz12919 {
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		String[] seoul = {"Jane", "Kim"};
		
		System.out.println(s.solution3(seoul));
	}
	
	static class Solution3 {
		// StringBuffer 메소드를 사용하기 위해 StringBuffer형으로 바꿔준다.
		public StringBuffer solution3(String[] seoul) {
			// StringBuffer의 생성방법이다.
			StringBuffer answer = new StringBuffer("김서방은 에 있다");
			//for문을 돌려 김서방과 이름이 같은 사람이 나오면
			//5번째에 i를 삽입한다. => insert() 메소드 사용
			for (int i = 0; i < seoul.length; i++) {
				if (seoul[i].equals("Kim")) {
					answer.insert(5, i);
				}
			}
			return answer;
		}
	}

}
