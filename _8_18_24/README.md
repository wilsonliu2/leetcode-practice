## [102. Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/description/)

1. use a queue to keep track of the level
2. qSize to check number of nodes in this level
3. poll each node from the queue, and add the children to the queue

time: O(n)

## [64. Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/description/)

1. traverse first row and col. since can only move left or down.
2. traverse rest of the grid. compare min of top and left

time: O(m \* n)
