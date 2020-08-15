//quicksort & partition
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        return quickSearch(arr, 0, arr.length - 1, k - 1);
    }

    private int[] quickSearch(int[] nums, int start, int end, int k) {
        int j = partition(nums, start, end);
        if (j == k) {
            return Arrays.copyOf(nums, j + 1);
        }
        return j > k ? quickSearch(nums, start, j - 1, k) : quickSearch(nums, j + 1, end, k);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int index = start - 1;
        swap(arr, pivot, end);
        for (int i = start; i <= end; i++) {
            if (arr[i] <= arr[end]) {
                index += 1;
                if (i > index) {
                    swap(arr, i, index);
                }
            }
        }
        return index;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
//PriorityQueue
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        Queue<Integer> queue = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int a : arr) {
            if (queue.size() < k) {
                queue.offer(a);
            }else if (a < queue.peek()) {
                queue.poll();
                queue.offer(a);
            }
        }
        int[] res = new int[queue.size()];
        int i = 0;
        for (int num : queue) {
            res[i++] = num;
        }
        return res;
    }
}
