## [347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/description/)

1. use hashmap to keep track of frequency of a value
2. use a min-heap to keep track of top k element with highest frequency.
3. if heap exceed top k remove the root element.

time complexity: O(nlogk) inserting and removing takes logk time. iterating over hashmap takes nlogk time.

## [238. Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/description/)

note: find the most water that can be contained between 2 lines.

1. use 2 pointers, one at the beginning and one at the end.
2. the area formed is determined by the shorter height multipled by the distance between the 2 lines
3. move the shorter height inwards and keep track of the max area

time complexity: O(n)
