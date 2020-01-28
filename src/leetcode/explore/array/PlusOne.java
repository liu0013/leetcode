package leetcode.explore.array;

public class PlusOne {
    /**
     * consider cases:
     * double, long
     * more than long type
     * [0]
     * [1, 2, 9]
     * [9, 9, 9]
     * @param digits
     * @return digits + 1
     */
    public int[] plusOne(int[] digits) {
        int next = 0;
        int[] newDigits = new int[digits.length + 1];
        for (int i = digits.length - 1; i >= 0; i--) {
            int current = digits[i];
            if (i == digits.length - 1) {
                current += 1;
            } else {
                current += next;
            }
            if (current == 10) {
                next = 1;
                current = 0;
            } else {
                next = 0;
            }
            newDigits[i+1] = current;
            digits[i] = current;
        }
        if (next > 0) {
            newDigits[0] = next;
            return newDigits;
        } else {
            return digits;
        }
    }
}
