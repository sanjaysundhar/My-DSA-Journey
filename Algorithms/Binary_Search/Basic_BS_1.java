/*
Search a number in a sorted array

Input: arr = [2, 4, 7, 9, 12, 19], target = 9
Return index. */

package Binary_Search;

public class Basic_BS_1 {
    public static void main(String[] args){
        int[] arr = {2, 4, 7, 9, 12, 19};
        int target = 9;

        System.out.println(findTarget(arr,target));
    }

    static int findTarget(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start+(end-start)/2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
