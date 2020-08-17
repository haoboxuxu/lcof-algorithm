class Solution {
    public int fib(int n) {
        int mod = (int)1e9+7;
        int first = 0;
        int second = 1;
        while (n-- != 0) {
            int temp = first + second;
            first = second % mod;
            second = temp % mod;
        }
        return first % mod;
    }
}
