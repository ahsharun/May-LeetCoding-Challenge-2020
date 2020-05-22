class Solution {
    public String frequencySort(String s) {
        ArrayList<Integer> freq = new ArrayList<>();
        int[] ints = new int[128];
        for(char ch : s.toCharArray()) {
            ints[ch]++;
        }
        for(int i = 0; i < 128; i++) {
            if(ints[i] != 0)
                freq.add(ints[i]);
        }
        Collections.sort(freq,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        Integer[] arr = new Integer[freq.size()];
        arr = freq.toArray(arr); freq.clear();
        for(int i = 0; i < arr.length; i++) {
            int max = arr[i];
            for(int j = 0; j < 128; j++) {
                if(ints[j] == max) {                    
                    while(ints[j]-- > 0) {
                        sb = sb.append((char) j);
                    }
                    break;
                }
            }
        }
        return sb.toString();
    }
}
