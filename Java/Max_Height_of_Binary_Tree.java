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
    public int maxDepth(TreeNode root) {
        //start at the root of the tree/subtree and see if the root is null, 
        //if it is return 0 to represent no level should be added to the total height 
        if (root == null){return 0;}
        //traverse left subtree 
        int leftHeight = maxDepth(root.left);
        //traverse right subtree 
        int rightHeight = maxDepth(root.right);
        //compare heights of both subtrees an return the greater 
        //and add one to represent the total number of levels including the root 
        //to get the height 
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

/**
notes:

To find the depth of the tree traverse both sides until reaching a node with no children
Two approaches: use recursion to traverse both the left and right subtrees and 1 + max(left, right) or go level by level using queues

 */
