//5 ms
class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }
}
//3 ms
class Solution {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
//2 ms
class Solution {
    public int findRepeatNumber(int[] nums) {
        int len = nums.length;
        //长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内
        int[] tmp = new int[len];
        for (int i = 0; i < len; i++) {
            tmp[nums[i]] += 1;
            if (tmp[nums[i]] > 1) {
                return nums[i];
            }
        }
        return -1;
    }
}

//1 ms
class Solution {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums[i]) {
                continue;
            }
            if (nums[i] == nums[nums[i]]) {
                return nums[i];
            }
            //swap
            int tmp = nums[nums[i]];
            nums[nums[i]] = nums[i];
            nums[i] = tmp;
            i--;
        }
        return -1;
    }
}
