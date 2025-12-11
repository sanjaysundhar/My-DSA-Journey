package Binary_Search;

public class Square_Root {
    public static void main(String[] args) {
        int sqrt = 8;

        System.out.println(findSqrt(sqrt));
    }

    static int findSqrt(int x){

        int start = 1;
        int end = x;
        int ans = 1;

        while (start < end){

            int mid = start+(end-start)/2;

            if ((mid*mid) <= x ){
                ans = mid;
                start = mid+1;
            } else {
                end = mid -1;
            }
        }
        return ans;
    }
}
