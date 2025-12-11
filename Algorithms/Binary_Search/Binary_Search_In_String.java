package Binary_Search;

public class Binary_Search_In_String {
    public static void main(String[] args){
        String[] arr = {"apple", "ball", "cat", "dog"};
        String target = "apple";

        System.out.println(findAnimal(arr,target));
    }

    static int findAnimal(String[] arr,String target){

        int start = 0;
        int end = arr.length-1;

        while (start <= end){

            int mid = start+(end-start)/2;

            if (arr[mid].compareTo(target) == 0) return mid;
            else if (arr[mid].compareTo(target) < 0) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
