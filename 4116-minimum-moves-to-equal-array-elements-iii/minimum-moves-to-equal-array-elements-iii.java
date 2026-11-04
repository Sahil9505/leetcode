class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        int ans=0;
        for(int m : nums){
            if(max<m){
                max = m;
            }
        }
        for(int m: nums){
            ans += max-m;
        }

        return ans;

    }
}