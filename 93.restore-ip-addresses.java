/*
 * @lc app=leetcode id=93 lang=java
 *
 * [93] Restore IP Addresses
 */

// @lc code=start
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res=new ArrayList<>();//to store result
        solve(0,s,new ArrayList<>(),res);//start from  starting index
        return res;
    }
    public void solve(int start,String s,List<String> parts,List<String> res){
        if(parts.size()==4 && start==s.length()){//basecase if parts=4 and start=s.length add to res with parts joining with '.'
            res.add(String.join(".",parts));
            return;
        }
        if(parts.size()>4||start>=s.length()){//if parts size >4 return or start go beyond s.length
            return;
        }
        for(int len=1;len<=3 && start+len<=s.length();len++){//take 1 length,2 length,3 length segments 
            String seg=s.substring(start,start+len);//since start only incement by one each time//take substring from start to start+len
            if(isvalid(seg)){//if substring is valid
                parts.add(seg);//add to parts 
                solve(start+len,s,parts,res);//recall solve function to start again from start+len
                parts.remove(parts.size()-1);//we can also leave the string we take 
            }


        }


    }
    public boolean isvalid(String segment){
        if(segment.isEmpty()||segment.length()>3){
            return false;
        }
        if(segment.length()>1 && segment.charAt(0)=='0'){
            return false;
        }
        int segm=Integer.parseInt(segment);
        if(segm>=0 && segm<=255){
            return true;
        }
        return false;
    }
}
// @lc code=end

