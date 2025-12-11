/*
Search a number that does not exist

Input: arr = [1, 5, 9, 14, 18], target = 15
Return -1
 */
package Binary_Search;

public class Basic_BS_2 {
    public static void main(String[] args){
        int[] arr = {1, 5, 9, 14, 18};
        int target = 15;

        System.out.println(findTarget(arr,target));
    }

    static int findTarget(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        if (arr == null || arr.length == 0) return  -1;


        while (start <= end){

            int mid = start+(end-start)/2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
