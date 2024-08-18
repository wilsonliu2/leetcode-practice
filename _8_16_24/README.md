## [347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/description/)

1. use hashmap to keep track of frequency of a value
2. use a min-heap to keep track of top k element with highest frequency.
3. if heap exceed top k remove the root element.

time complexity: O(nlogk) inserting and removing takes logk time. iterating over hashmap takes nlogk time.