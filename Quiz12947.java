package programmers;

public class Quiz12947 {
	public static void main(String[] args) {
		int s = 10;
		Solution3 sdf = new Solution3();
		
		System.out.println(sdf.solution3(s));
	}
	
	static class Solution3 {
	    public boolean solution3(int x) {
	        int a = 0;
	        int xd = x;
	        while(xd > 0) {
	        	a += xd%10;
	        	xd = xd/10;
	        }
	        System.out.println(a);
	        if(x%a == 0) {
	        	return true;
	        } else return false;
	    }
	}

}
