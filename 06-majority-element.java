class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a :nums) {
            if(map.containsKey(a)){
                map.replace(a, map.get(a) +1 );
            }else {
                map.put(a, 1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) > nums.length/2){
                return key;
            }
        }
        return 0;
    }
}
