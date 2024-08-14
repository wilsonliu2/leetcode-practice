## [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)

1. use sliding window. i and j represents the window.
2. i is the start, j will explore new characters
3. as you move j check if new character is found in the hashset
4. when duplicate is found move i to start a new window.

time complexity: O(n)

## [Container With Most Water](https://leetcode.com/problems/container-with-most-water/)

note: find the most water that can be contained between 2 lines.

1. use 2 pointers, one at the beginning and one at the end.
2. the area formed is determined by the shorter height multipled by the distance between the 2 lines
3. move the shorter height inwards and keep track of the max area

time complexity: O(n)
