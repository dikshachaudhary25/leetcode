class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftNodes = maxDepth(root.left);
        int rightNodes = maxDepth(root.right);
        int height = Math.max(leftNodes, rightNodes) +1;
        return height;
    }
}
