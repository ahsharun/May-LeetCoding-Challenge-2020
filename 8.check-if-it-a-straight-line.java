class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }
        int j=1;
        float slope;
        slope = (float)(coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
        for(;j< coordinates.length -1; j++ ){
            float  m  = (float)(coordinates[j+1][1] - coordinates[j][1]) / (coordinates[j+1][0] - coordinates[j][0]);
            if(m != slope){
                return false;
            }
        }
        return true;
    }
}
