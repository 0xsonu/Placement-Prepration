import Utils.VersionControl;

public class Solution278 {
  public static void main(String[] args) {

  }

  public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
      int start = 0;
      int end = n;

      while (start <= end) {
        int mid = start + ((end - start) / 2);
        boolean isThisBadVersion = isBadVersion(mid);

        if (isThisBadVersion) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
      return start;
    }
  }

}
