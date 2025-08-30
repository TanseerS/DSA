// 1295. Find Numbers with Even Number of Digits
public class Leetcode1295 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 2, 6, 7896};
        int ans = even(arr);
        System.out.println(ans);
    };

    static int even(int[] arr){
        int evenCount = 0;
        for(int element : arr){
            int count = 0;
            while(element > 0){
                element /= 10;
                count += 1;
            };
            if(count % 2 == 0){
                evenCount++;
            };
        };
        return evenCount;
    }
}
