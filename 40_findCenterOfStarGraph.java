/*
There is an undirected star graph consisting of n nodes labeled from 1 to n. A star graph is a graph where there is one center node and exactly n - 1 edges that connect the center node with every other node.

You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between the nodes ui and vi. Return the center of the given star graph.

Input: edges = [[1,2],[2,3],[4,2]]
Output: 2
Explanation: As shown in the figure above, node 2 is connected to every other node, so 2 is the center.

here as we can see that in each pair 2 is common so we can take it as center of the graph.
so based on this we are solving this problem .

*/

class Solution {
    public int findCenter(int[][] edges) {
        int a=edges[0][0];
        int b=edges[0][1];
        if(a==edges[1][0] || a==edges[1][1])
        {
            return a;
        }
        else
        {
            return b;
        }
       // return 1;
    }
}
