class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer>preorder = new ArrayList<>();
        if (root==null) {
            return preorder;
        }
        Stack<TreeNode>st = new Stack<TreeNode>();
        st.push(root);

        while (!st.isEmpty()) {
            root = st.pop();
            preorder.add(root.val);
            if (root.right != null) {
                st.push(root.right);
            }
            if (root.left != null) {
                st.push(root.left);
            }
        }
        
        return preorder;

        
    }
}
