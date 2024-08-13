## [3Sum](https://leetcode.com/problems/3sum/description/)

note: return 3 different elements that sums to 0 and the result list cannot have the same triplets

1. sort the array and use 2 pointers. fixed index, index + 1 and length - 1.

2. calculate if sum is 0. if it is add to list. if sum is less than 0. increment left, if sum is more than 0 decrement right.

avoid duplicates:
compare left and right values. if their next value is the same, skip it.

time complexity: O(n^2)
main loop is nested

## [Group Anagrams](https://leetcode.com/problems/group-anagrams/description/)

note: return grouped anagrams

1. sort the char array to determine if it is an anagram
2. use hashMap the key is the sorted string and the value is a list of string that is anagram of that sorted string

time complexity: O(n \* mlogm)

n is # of elements from the array

sorting a string with m characters = O(m log m)
