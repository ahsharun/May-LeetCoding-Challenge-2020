class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        ArrayList<Character> set = new ArrayList<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            set.add(ransomNote.charAt(i));
        }
        int rc = set.size();
        for (int j = 0; j < magazine.length(); j++) {
            if(rc==0){
                break;
            }
            char ch = magazine.charAt(j);
            if(set.contains(ch)){
                rc--;
                int in = set.indexOf(ch);
                set.remove(in);
            }
        }
       return rc == 0;
    }
}
