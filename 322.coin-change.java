/*
 * @lc app=leetcode id=322 lang=java
 *
 * [322] Coin Change
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp =new int[coins.length+1][coins.length+1];
        for(int i=0;i<=coins.length;i++){
            for(int j=0;j<=amount;j++){
                if(i==0){
                    dp[i][j]=Integer.MAX_VALUE;
                }else if(j==0){
                    dp[i][j]=0;
                }else if(coins[i-1]<=j){
                    dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);}
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[coins.length][amount]==Integer.MAX_VALUE? -1: dp[coins.length
                                    ][amount];
    }
}


        
  

// @lc code=end

