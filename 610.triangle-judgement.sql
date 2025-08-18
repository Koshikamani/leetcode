--
-- @lc app=leetcode id=610 lang=mysql
--
-- [610] Triangle Judgement
--

-- @lc code=start
# Write your MySQL query statement below

select x,y,z,
         case when x>0 AND y>0 AND z>0 AND x + y > z and x + z > y and y + z > x then 'Yes'
                else 'No' end as triangle
from Triangle;

-- @lc code=end

