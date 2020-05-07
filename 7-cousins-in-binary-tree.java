/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Map<String, Integer> map  = new HashMap<>();
    public boolean isCousins(TreeNode root, int x, int y) {
        int level = 0;
        findPL(root, x, y, level);
        return (!map.get("xp").equals(map.get("yp"))) && (map.get("xl").equals(map.get("yl")));
        
        
    }
    public void findPL(TreeNode root, int x, int y, int level) {
        if(root == null){
            return;
        }
        level++;
        if((root.left != null && root.left.val == x)|| (root.right != null && root.right.val==x)){
            map.put("xp", root.val);
            map.put("xl", level);
        }

        if((root.left != null && root.left.val == y)|| (root.right != null && root.right.val==y)){
            map.put("yp", root.val);
            map.put("yl", level);
        }
        if(root.val == x && (level == 1)){
            map.put("xp", root.val);
            map.put("xl", level);
        }
        if(root.val == y && (level == 1)){
            map.put("yp", root.val);
            map.put("yl", level);
        }
        if(root.left != null){
            findPL(root.left, x, y, level);
        }
        if(root.right != null) {
            findPL(root.right, x, y, level);
        }
    }
}
