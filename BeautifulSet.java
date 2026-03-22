public import java.util.*;

public class BeautifulSet {

    static List<List<Integer>> tree;
    static int[] color;

    // DFS function
    static int dfs(int node, Set<Integer> usedColors) {

        // अगर color already present है → stop
        if (usedColors.contains(color[node])) {
            return 0;
        }

        usedColors.add(color[node]);

        int max = 0;

        // सभी children explore करो
        for (int child : tree.get(node)) {
            max = Math.max(max, dfs(child, usedColors));
        }

        usedColors.remove(color[node]); // backtrack

        return 1 + max; // current node + best child path
    }

    public static void main(String[] args) {

        int n = 5;

        int[] parent = {0, 1, 2, 1, 3};
        color = new int[]{0, 4, 3, 4, 3, 5};

        tree = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        // tree build
        for (int i = 2; i <= n; i++) {
            tree.get(parent[i - 1]).add(i);
        }

        int[] queries = {4, 3, 3};
        int totalAnswer = 0;

        for (int q : queries) {
            int result = dfs(q, new HashSet<>());
            totalAnswer += result;
        }

        System.out.println(totalAnswer); // Output: 5
    }
} {
    
}
