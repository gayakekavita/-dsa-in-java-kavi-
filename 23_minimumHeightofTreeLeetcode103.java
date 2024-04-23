// height of a tree is distance from root to farthest leaf.
/*
  Brute force approch ::
   1. assume each node is root 
   2. calculate height of each root tree
   3. find out minimum height from all these root elements or node 


   n=6  
   edegs=  [[3,0],[3,1],[3,2],[5,4]]
   output:
    [3,4]
    
   
*/
/*
  Optimal approch ::
   1. find center node.
   2.anwer can be at most two node 
*/

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1)
            return Collections.singletonList(0);
        
        List<Integer> result = new ArrayList<>();
        int[] indegree = new int[n];
        Map<Integer, List<Integer>> adj = new HashMap<>();
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            indegree[u]++;
            indegree[v]++;
            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 1) // adding all leaf nodes so that we can remove them later
                que.offer(i);
        }
        
        while (n > 2) {
            int size = que.size();
            n -= size; // removing nodes with indegree 1
            
            while (size-- > 0) {
                int u = que.poll();
                for (int v : adj.getOrDefault(u, Collections.emptyList())) {
                    indegree[v]--;
                    if (indegree[v] == 1)
                        que.offer(v);
                }
            }
        }
        
        while (!que.isEmpty()) {
            result.add(que.poll());
        }
        return result;
    }
}
