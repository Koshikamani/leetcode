--
-- @lc app=leetcode id=596 lang=mysql
--
-- [596] Classes With at Least 5 Students
--

-- @lc code=start
# Write your MySQL query statement below

select class from Courses Group by class Having count(Distinct student) >= 5;
-- @lc code=end

