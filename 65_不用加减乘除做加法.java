class Solution {
    public int add(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1; //进位
            a ^= b; //非进位和
            b = c; //b = 进位
        }
        return a;
    }
}
