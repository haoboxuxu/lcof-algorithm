public class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += 1;
            n = lowbit(n);
        }
        return res;
    }
    private int lowbit(int x) {
        x &= x - 1;
        return x;
    }
}
