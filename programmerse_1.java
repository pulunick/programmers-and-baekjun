public class programmerse_1 {
    public static void main(String[] args) {
            int price = 3;
            int money = 20;
            int count = 4;

        Solution sdf = new Solution();
        System.out.println(sdf.solution(price, money, count));


    }
    static class Solution {
        public long solution(int price, int money, int count) {
            long answer = -1;
            long am = 0;
            for(long i = 1; i<=count; i++) {
               am += price * i;
            }

            answer = (money - am)*answer;

            if(money > am) {
                answer = 0;
            }
            return answer;
        }
    }
}
