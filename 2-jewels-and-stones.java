class Solution {
    public int numJewelsInStones(String J, String S) {
        int cn =0;
        for (int i = 0; i <= S.length() - 1; i++) {
            char ch = S.charAt(i);
            for (int j = 0; j <= J.length() - 1; j++) {
                if (ch == J.charAt(j)) {
                    cn++;
                    break;
                }
            }
        }
        return cn;
    }
}
