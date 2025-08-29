// Start searching from first element till the target is found
// Time complexity: O(n)
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 2;
        int ans = linearsearch(arr, target);
        System.out.println(ans);
    };
    static int linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        };
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
