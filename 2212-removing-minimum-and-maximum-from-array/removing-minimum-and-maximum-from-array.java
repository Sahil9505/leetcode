class Solution {
    public int minimumDeletions(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int n = nums.length;
        for(int i=0; i<n; i++){
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }
        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == min) {
                minIndex = i;
            }

            if (nums[i] == max) {
                maxIndex = i;
            }
        }

        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        int fromFront = right + 1;

        int fromBack = n - left;

        int bothSides = (left + 1) + (n - right);

        return Math.min(fromFront, Math.min(fromBack, bothSides));
    }
}