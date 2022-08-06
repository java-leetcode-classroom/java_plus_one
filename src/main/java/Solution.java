public class Solution {
  public int[] plusOne(int[] digits) {
    int carry = 1;
    int lastPos = digits.length - 1;
    for (int pos = lastPos; pos >= 0; pos--) {
      int result = digits[pos] + carry;
      carry = (result > 9) ? 1:0;
      digits[pos] = result % 10;
    }
    int start = 0;
    int resSize = (carry == 1) ? digits.length + 1:digits.length;
    int[] res = new int[resSize];
    if (carry == 1) {
      res[start] = carry;
      start++;
    }
    for (int pos = 0; pos <= lastPos; pos++) {
      res[start+pos] = digits[pos];
    }
    return res;
  }
}
