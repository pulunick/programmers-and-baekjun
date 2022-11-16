package programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz120903_a {
	public static void main(String[] args) {
		String[] s1 = { "a", "b", "c" };
		String[] s2 = { "com", "b", "d", "p", "c" };
		
		Quizz sdfs = new Quizz();
		Quizzz sdf = new Quizzz();
		
		System.out.println(sdfs.quiz3(s1, s2));
		
		System.out.println(sdf.quiz4(s1, s2));
		

	}

	static class Quizz {
		public int quiz3(String[] s1, String[] s2) {
			int answer = 0;
			for (int i = 0; i < s1.length; i++) {
				for (int j = 0; j < s2.length; j++) {
					if (s1[i] == s2[j]) {
						answer++;
					}
				}
			}
			return answer;
		}
		
	}
	
	static class Quizzz {
		public int quiz4(String[] s1, String[] s2) {
			
		int answer = 0;
        List<String> stringList = Arrays.stream(s1).collect(Collectors.toList());

        for (String string : s2) {
            if (stringList.contains(string)) answer++;
        }
        return answer;
		}
	}
}
