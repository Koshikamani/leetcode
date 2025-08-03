/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// // @lc code=start
// class Solution {
// // public int reverseBits(int n) {
// //     int result = 0;
// //     for (int i = 0; i < 32; i++) {
// //         result <<= 1;
// //         result |= (n & 1);
// //         n >>>= 1;
// //     }
// //     return result;
// // }
// }

//lowlevel code

class Solution {
    
    public int reverseBits(int num) {
        
        num = ((num & 0xffff0000) >>> 16) | ((num & 0x0000ffff) << 16);
        num = ((num & 0xff00ff00) >>> 8) | ((num & 0x00ff00ff) << 8);
        num = ((num & 0xf0f0f0f0) >>> 4) | ((num & 0x0f0f0f0f) << 4);
        num = ((num & 0xcccccccc) >>> 2) | ((num & 0x33333333) << 2);
        num = ((num & 0xaaaaaaaa) >>> 1) | ((num & 0x55555555) << 1);
        
        return num;
        
    }
}

// @lc code=end

