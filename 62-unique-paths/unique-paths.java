class Solution {
    public int uniquePaths(int m, int n) {
        long noOfPath = ncr(m+n-2, n-1);
        return (int) noOfPath;
    }

    public long ncr(int n, int r){
        if (r < 0 || r > n) {
            return 0;
        }
        if (r > n - r) {
            r = n - r;
        }
        
        long result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - r + i) / i;
        }
        return result;
    }
}