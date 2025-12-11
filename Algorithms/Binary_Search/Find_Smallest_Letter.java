package Binary_Search;

public class Find_Smallest_Letter {
    public static void main(String[] args) {
        char[] letters  = {'c','f','j'};
        char target = 'z';

        System.out.println(findLetter(letters,target));
    }

//    static char findLetter(char[] letters,char target){
//
//        int start = 0;
//        int end = letters.length-1;
//        while (start <= end){
//
//            int mid = start+(end-start)/2;
//
//            if (letters[mid] <= target){
//                start = mid+1;
//            } else {
//                end = mid-1;
//            }
//        }
//        return letters[start % letters.length];
//    }

    static char findLetter(char[] letters,char target){

        int start = 0;
        int end = letters.length-1;
        int ans = 0;
        while (start <= end){

            int mid = start+(end-start)/2;

            if (letters[mid] > target){
                ans = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return letters[ans];
    }
}
