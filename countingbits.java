import java.io.*;
import java.util.*;



class Solution {

    private int popCount(int x) {
        int count;
        for (count = 0; x != 0; ++count) {
            x &= x - 1; // zeroing out the least significant nonzero bit
           // System.out.println(count);
        }
        //System.out.println(count);
        return count;
    }

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int x = 0; x <= n; ++x) {
            ans[x] = popCount(x);
        }

        return ans;
    }
  
  public int[] countBit(int num) {
    int[] f = new int[num + 1];
    
    //with bit shift operation
    for (int i=1; i<=num; i++){
    f[i] = f[i >> 1] + (i & 1);
  }
    return f;
}

  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(Arrays.toString(s.countBits(5)));
    System.out.println(Arrays.toString(s.countBit(5)));
  }
}
