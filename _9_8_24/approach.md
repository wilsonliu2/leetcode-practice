## [692. Top K Frequent Words](https://leetcode.com/problems/top-k-frequent-words/description/)

use hashmap to count frequency, priority queue for getting top k frequent word. compare the word inside pq to sort the word in lexicographical order.

time: O(n log k) (n- # of words, k- # of words to return)
