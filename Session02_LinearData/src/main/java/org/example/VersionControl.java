package org.example;

public class VersionControl {

    public boolean isBadVersion(int n, int x){
        return n==x;
    }
    public int firstBadVersion(int  n, int x){
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left)/ 2;
            if (isBadVersion(mid,x)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

}
