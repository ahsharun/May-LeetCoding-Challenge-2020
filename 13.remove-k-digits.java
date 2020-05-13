class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == 0) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder(num);
        for (int i = 0; i < k; i++) {
            int m = 0;
            while (m < stringBuilder.length() - 1 && stringBuilder.charAt(m) <= stringBuilder.charAt(m + 1)) {
                m++;
            }
            stringBuilder.delete(m, m + 1);
        }
            while (stringBuilder.length() > 1 && stringBuilder.charAt(0) == '0'){
                stringBuilder.delete(0,1);
            }
            if (stringBuilder.length() == 0) {
                return "0";
            }
        return stringBuilder.toString();
    }
}
