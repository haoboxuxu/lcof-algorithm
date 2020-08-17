class Solution {
    public String replaceSpace(String s) {
        int len = s.length();
        char[] arr = new char[len*3];
        int index = 0;
        
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                arr[index++] = '%';
                arr[index++] = '2';
                arr[index++] = '0';
            }else {
                arr[index++] = c;
            }
        }
        
        String res = new String(arr, 0, index);
        return res;
    }
}
