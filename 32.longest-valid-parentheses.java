import java.util.Stack;

/*
 * @lc app=leetcode id=32 lang=java
 *
 * [32] Longest Valid Parentheses
 */

// @lc code=start
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Marcador inicial para facilitar a contagem correta
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(i); // Armazena a posição do '('
            } else {
                stack.pop(); // Remove um '(' correspondente
                if (stack.isEmpty()) {
                    stack.push(i); // Atualiza o marcador quando não há mais '(' na pilha
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek()); // Calcula o comprimento válido
                }
            }
        }

        return maxLength;
    }
}
