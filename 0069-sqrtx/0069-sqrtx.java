class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;

        while(start <= end){
            int mid = (start + end) / 2;

            if(mid*mid==x){
                return mid;
            } else if(mid > x / mid){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }
}


