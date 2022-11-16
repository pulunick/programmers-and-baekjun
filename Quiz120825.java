package programmers;


public class Quiz120825 {
	public static void main(String[] args) {
		String my_string = "hello";
		int n = 3;
		Solu sd = new Solu();

		System.out.println(sd.solu(my_string, n));

	}
}

class Solu {
	public String solu(String my_string, int n) {
		String str = "";
		for (int i = 0; i < my_string.length(); i++) {
			for (int j = 0; j < n; j++) {
				str += my_string.charAt(i);
			}
		}
		return str;
	}
}

class Solud {
	public String solut(String my_string, int n) {
		String answer = "";

		for (char s : my_string.toCharArray()) {
			for (int i = 0; i < n; i++) {
				answer += s + "";
			}
		}

		return answer;
	}

}