public class Leetcode1672 {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {12, 2, 3, 3}
        };
        int ans = maximumWealth(accounts);
        System.out.println(ans);
        
    };

    static int maximumWealth(int[][] accounts){
        int max = 0;
        for(int[] row: accounts){
            int count = 0;
            for(int col: row){
                count = count + col;
            };
            if(count > max){
                max = count;
            };
        };
        return max;
    }
}
