lass Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];       // Elements from x: x1, x2, ...
            result[2 * i + 1] = nums[n + i]; // Elements from y: y1, y2, ...
        }
        
        return result;
    }
}
