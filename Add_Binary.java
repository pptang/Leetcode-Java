public class Solution {
    public String addBinary(String a, String b) {
        
        int aSize = a.length();
        int bSize = b.length();
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        for (int i = aSize -1, j = bSize - 1; i >= 0 || j >= 0; i--, j--) {
            int aDigit = (i < 0) ? 0 : a.charAt(i) - '0';
            int bDigit = (j < 0) ? 0 : b.charAt(j) - '0';
            int digit = (aDigit + bDigit + carry) % 2;
            carry = (aDigit + bDigit + carry) / 2;
            builder.insert(0, (char) (digit + '0') );
        }
        
        if (carry == 1) {
            builder.insert(0, '1');
        }
        
        
        return builder.toString();
    }
}