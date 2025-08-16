/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null||digits.length()==0){
            return res;
        }
        Map<Character,String> m=new HashMap<>();
        m.put('2',"abc");
        m.put('3',"def");
        m.put('4',"ghi");
        m.put('5',"jkl");
        m.put('6',"mno");
        m.put('7',"pqrs");
        m.put('8',"tuv");
        m.put('9',"wxyz");
        solve (0,digits,new StringBuilder(),res,m);
        return res;  
    }
    public void solve(int index,String digits,StringBuilder combs,List<String> res,Map<Character,String> m){
        if(index==digits.length()){
            res.add(combs.toString());
            return;
        }
        String letters=m.get(digits.charAt(index));
        for(char let:letters.toCharArray()){
            combs.append(let);
            solve(index+1,digits,combs,res,m);
            combs.deleteCharAt(combs.length()-1);
        }
    }
}
// @lc code=end

