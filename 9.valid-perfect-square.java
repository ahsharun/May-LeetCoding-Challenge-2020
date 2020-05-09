class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1, high = num;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int div = num / mid, rem = num % mid;
            if (div == mid && rem == 0) {
                return true;
            } else if (div > mid) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return false;
    }
}
