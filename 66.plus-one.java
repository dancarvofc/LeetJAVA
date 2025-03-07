
/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Percorre o array de trás para frente
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Apenas incrementa se não for 9
                return digits;
            }
            digits[i] = 0; // Se for 9, vira 0 e continua
        }

        // Se chegou aqui, todos eram 9, então criamos um novo array maior
        int[] result = new int[n + 1];
        result[0] = 1; // O primeiro dígito será 1 (ex: 999 → 1000)

        return result;
    }
}

// @lc code=end
