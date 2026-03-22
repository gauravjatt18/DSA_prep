import java.util.*;

public class BeautifulTree {

    static List<Integer>[] tree;
    static int[] color;
    static int maxSize;

    static void dfs(int node, Set<Integer> set) {
        if (set.contains(color[node])) return;

        set.add(color[node]);
        maxSize = Math.max(maxSize, set.size());

        for (int child : tree[node]) {
            dfs(child, set);
        }

        set.remove(color[node]); // backtrack
    }

    static int solveQuery(int s) {
        maxSize = 0;
        dfs(s, new HashSet<>());
        return maxSize;
    }

    public static void main(String[] args) {
        int n = 5;

        int[] parent = {0,1,2,1,3};
        color = new int[]{0,4,3,4,3,5};

        tree = new ArrayList[n+1];
        for(int i=0;i<=n;i++) tree[i]=new ArrayList<>();

        for(int i=2;i<=n;i++){
            tree[parent[i-1]].add(i);
        }

        int[] queries = {4,3,3};
        int ans = 0;

        for(int q : queries){
            ans += solveQuery(q);
        }

        System.out.println(ans); // output: 5
    }
}