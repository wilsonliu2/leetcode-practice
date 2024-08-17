## [Merge Intervals](https://leetcode.com/problems/merge-intervals/)

1. sort the intervals by their start time.
2. if current interval does not overlap with the previous, add it to the merge list
3. if overlaps, then update the previous end interval with the new end interval

time complexity: O(nlogn) (sorting)
