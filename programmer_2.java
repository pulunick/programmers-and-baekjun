import java.util.Arrays;

public class programmer_2 {
    public static void main(String[] args) {
        int[][] a = {{1,2},{2,3}};
        int[][] b = {{3,4},{5,6}};
        Solution2 sdf = new Solution2();
        System.out.println(Arrays.deepToString(sdf.solution(a, b)));
    }

    static class Solution2 {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1.length][arr1[0].length];
            for(int i = 0; i < arr1.length; i++) {
                for(int j = 0; j < arr1[0].length; j++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            return answer;
        }
    }
}
