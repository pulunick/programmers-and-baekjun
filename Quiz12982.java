package programmers;

import java.util.Arrays;

// 예산(프로그래머스 Quiz12982)
// 		d		budget	result
// [1,3,2,5,4]	10		4

// d는 각 부서에  필요한 금액이고 10원(budget)은 가지고있는 예산입니다
// 부서에는 무조건 금액에 맞춰 예산을 지급해야 합니다
// 예산으로 최대한 많은 부서에 지급하고 지급한 부서의 개수를 반환하세요
//(keypoint - 부서 순서는 상관없이 최대한 많이 지급)

// URL : https://school.programmers.co.kr/learn/courses/30/lessons/12982

// 이클립스에서 실행할 수 있도록 main 만들어 놓았음

public class Quiz12982 {
	public static void main(String[] args) {
		Solution s= new Solution();
		int[] d = { 1, 3, 2, 5, 4 };
		System.out.println(s.solution(d, 10)); // 4 출력돼야 함
	}
}

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // 배열을 정렬 해준다.
        Arrays.sort(d);
        int sum = 0;
        
        for(int i = 0; i < d.length; i++) {
        	// 정렬 한 후 가장 작은 값부터 더해준다.
        	sum += d[i];
        	// 더해줄때마다 budget과 비교 한 후 실행되면 더해준다.
        	if(budget >= sum) {
        		answer++;
        	}
        }
        return answer;
    }
}