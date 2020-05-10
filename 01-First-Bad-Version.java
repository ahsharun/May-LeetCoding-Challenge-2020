public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low =1;
        int high = n;
        int middle ;
        while(low <= high){
            middle = ((high - low)>>1) + low;
            if(isBadVersion(middle)){
                high = middle - 1;
            }else{
                low = middle + 1;
            }
        }
        return high + 1;
    }
}
