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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        
        Queue<TreeNode> q=new LinkedList<>();
        
        if(root==null) 
            return ans;
        
        boolean leftToRight=true;
        
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> currentList=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode node=q.peek();
                q.remove();
                if(leftToRight){
                   currentList.add(node.val);
                }
                else {
                  currentList.add(0,node.val);
                }
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                   q.add(node.right);
                 }
           }
            ans.add(currentList);
            leftToRight=!leftToRight;
        }
        
        return ans;
    }
}