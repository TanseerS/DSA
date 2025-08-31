// Use when it is not known wether the array is asc or dsc
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {9, 8, 6, 4, 1};
        int target = 4;
        int ans = orderAgno(arr, target);
        System.out.println(ans);
    };
    static int orderAgno(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            };
            if(isAsc){
                if(arr[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(arr[mid] > target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        };
        return -1;
    }
}
