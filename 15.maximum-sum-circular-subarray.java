class Solution {
    public int maxSubarraySumCircular(int[] A) {
        if(A.length == 0) return 0;
        int currSum = A[0];
        int maxSum = A[0];
        int maxTotal = A[0];
        int minTotal = A[0];
        int minSum = A[0];
        for(int i = 1; i < A.length; i++){
            int curr = A[i];
            maxSum = Math.max(curr, maxSum + curr);
            maxTotal = Math.max(maxSum, maxTotal);
            minSum = Math.min(curr, minSum + curr);
            minTotal = Math.min(minTotal, minSum);
            currSum = currSum +  curr;
        }
        if(currSum == minSum) return maxTotal;
        return Math.max(currSum - minTotal, maxTotal);
        
    }
}
