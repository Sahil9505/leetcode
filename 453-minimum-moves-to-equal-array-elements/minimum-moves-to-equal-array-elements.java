class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
        int ans=0;
        for(int m:nums){
            if(min>m){
                min=m;
            }
        }
        for(int m:nums){
            ans += m-min;
        }

        return ans;
    }
}