/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q || root == null) return root;
        TreeNode lans = lowestCommonAncestor(root.left, p, q);
        TreeNode rans = lowestCommonAncestor(root.right, p, q);

        if(lans != null && rans != null) return root;
        if(lans != null) return lans;
        return rans;
    }
}