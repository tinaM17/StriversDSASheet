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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        preorderRecursive(root,ans);
        return ans;
    }
    
    private void preorderRecursive(TreeNode root, List<Integer> ans){
        if(root==null) return;
        ans.add(root.val);
        preorderRecursive(root.left,ans);
        preorderRecursive(root.right,ans);
    }
}