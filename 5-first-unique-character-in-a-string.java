class Solution {
    public int firstUniqChar(String s) {
        ArrayList<Character> visited = new ArrayList<>();
        if(s.length() == 1){
            return 0;
        }
        char[] chars = s.toCharArray();
        char curr = 0;
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            curr = s.charAt(i);
            if(visited.contains(curr)){ continue;}
            index = i;
            for (int j = i + 1; j < s.length(); j++) {
                if (chars[i] == chars[j]) {
                    visited.add(s.charAt(i));
                    curr = 0;
                    index = -1;
                    break;
                }
            }
            if(curr != 0){
                break;
            }
        }
        return index;
        
    }
}
