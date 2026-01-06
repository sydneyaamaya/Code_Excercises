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
    public TreeNode deleteNode(TreeNode root, int key) {
        //make sure root is not null otherwise return 
        if (root == null) return root;

        //check if the key is less than or greater than the root
        if (key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.val){
            root.right = deleteNode(root.right, key);
        }
        //delete the node after finding it 
        else {
            //case if one or none children exist
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            //case if two children exist 
            else {
                //find the inorder successor by traverseing the 
                //right subtree for the smallest value and store it in t
                TreeNode t = root.right;
                while (t.left != null){
                    t = t.left;
                }
                //replace the root with the inorder successor
                root.val = t.val;
                //delete the inorder successor 
                root.right = deleteNode(root.right, t.val);
            }
        }
        return root;
    }
}

/**
notes:
If the key is less than the root go left and if the key is greater than go right
If the key is found delete it 
After deletion
    1. if the node has no child just remove the node
    2. if the node has one child replace the node with the child 
    3. if the node has two children, find the inorder successor (the smallest node
    on the right side) and replace the node with the child 
 */
