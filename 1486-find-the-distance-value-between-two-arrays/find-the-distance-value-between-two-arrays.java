class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        int pointer=0;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(Math.abs(arr1[i]-arr2[j]) > d){
                    pointer++;
                }
            }
            if(pointer == arr2.length){
                ans++;
                pointer=0;
            }else{
                pointer=0;
            }
        }
        return ans;
    }
}