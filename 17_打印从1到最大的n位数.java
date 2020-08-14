class Solution {
    public int[] printNumbers(int n) {
        int len = (int) (Math.pow(10, n) - 1);
        int[] res = new int[len];
        for (int i = 1; i <= len; i++) {
            res[i - 1] = i;
        }
        return res;
    }
}
