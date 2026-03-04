# DPV (Dasgupta-Papadimitriou-Vazirani) Problems

## Chapter 3

### 3.8 Pouring Water
a. Let our directed graph be G=(V,E). Each node will represent the current state of the three containers 1,2, and 3 respectively where Container 1 has a capacity of 4, Container 2 has a capacity of 7, and Container 3 has a capacity of 10. The root node therefore is 4,7,0 because the containers with capacities 4 and 7 are filled, while the container with capacity 10 is empty.

Specifically, we are looking for either the node (\*,2,\*) or (2,\*,\*).

b. DFS is the algorithm we will use. One modification to be made is the termination condition, which is checking if we reach either of our desired nodes. If we never do and the DFS completes its run, then we can return FALSE>

c. TODO

### 3.15 Computopia

a. Let our directed graph be G=(V,E) where all vertices (V) are intersections and edges (E) are streets. We can use the known property of SCC (strongly connected components) to solve this problem. This is because in a strongly connected component, all vertices have a path to all other vertices.

Run the SCC algorithm, and get a count of strongly connected components. If the count is equal to 1, then we return TRUE (the mayor's claim is true), otherwise return FALSE.

This takes linear time because the SCC algorithm takes O(n+m)

b. This alteration of the problem states that we can always reach the root node (Town Hall) traversing all edges. 





