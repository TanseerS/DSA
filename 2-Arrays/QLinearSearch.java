public class QLinearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        int ans = linearsearch(arr, target);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        };
        int start = 1;
        int end = 4;
        int index = start;
        while(index<=end){
            if(arr[index] == target){
                return index;
            };
            index++;
        };
        return -1;
    }
}
