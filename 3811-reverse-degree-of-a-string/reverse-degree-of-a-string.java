class Solution {
    public int reverseDegree(String s) {
        int product=0;
        int sum=0;
        for(int i=0; i<s.length(); i++){
            int n = ((s.charAt(i) - 'a')-26)*(-1);
            product = n*(i+1);
            sum += product;
        }
        return sum;
    }
}