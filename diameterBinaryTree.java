class Solution {
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);

        return 1 + Math.max(left, right);
    }
    public void diameter(TreeNode root, int[]ans){
         if(root == null){
            return;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int diameter = leftHeight+rightHeight;
        ans[0] = Math.max(diameter, ans[0]);
        diameter(root.left,ans);
        diameter(root.right,ans);

        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        int[]ans = new int[1];
        diameter(root, ans);
        return ans[0];
       
    }
}
