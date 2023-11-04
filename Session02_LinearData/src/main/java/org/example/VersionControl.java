package org.example;

public class VersionControl {
    public class Version{
        public static int x;
    }

    public static boolean isBadVersion(int n){
        if (n>=Version.x) return true;
        return false;
    }
    public static int firstBadVersion(int  n){
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left)/ 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
    public static void main(String[] args){
        Version.x=4;
        int isbad=firstBadVersion(5);
        System.out.println(isbad);;
    }
}
