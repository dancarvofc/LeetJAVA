/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
 */

// @lc code=start
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Se ambos os nós são nulos, as árvores são iguais
        if (p == null && q == null) {
            return true;
        }
        
        // Se um dos nós é nulo e o outro não, as árvores são diferentes
        if (p == null || q == null) {
            return false;
        }

        // Se os valores dos nós são diferentes, as árvores são diferentes
        if (p.val != q.val) {
            return false;
        }

        // Recursivamente comparar as subárvores esquerda e direita
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    
    }
}
// @lc code=end

