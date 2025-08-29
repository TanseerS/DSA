// Start searching from first element till the target is found
// Time complexity: O(n)
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 2;
        int ans = linearsearch(arr, target);
        System.out.println(ans);

        String name = "Tanseer";
        char target1 = 't';
        boolean ans1 = linearsearch1(name, target1);
        System.out.println(ans1);
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
    };

    // Linear search in String

    static boolean linearsearch1(String str, char target){
        if(str.length() == 0){
            return false;
        };
        for(int i = 0; i < str.length(); i++){
            char element = str.charAt(i);
            if(element == target){
                return true;
            };
        };
        return false;
    }
}
