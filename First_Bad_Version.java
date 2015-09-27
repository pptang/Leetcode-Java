public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int top = n;
        int bottom = 1;
        int mid = 1;
        int firstBadVersion = 1;
        while (top >= bottom) {
            
            mid = bottom + (top - bottom) / 2;
            
            if (isBadVersion(mid)) {
                top = mid - 1;
                firstBadVersion = mid;
            } else {
                bottom = mid + 1;
            }
        }
        
        return firstBadVersion;
    }
}