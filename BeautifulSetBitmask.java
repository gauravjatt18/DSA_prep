public import java.util.*;

public class BeautifulSetBitmask {

    static List<List<Integer>> tree;
    static int[] color;

    static int dfs(int node, int mask) {

        int c = color[node];

        // अगर color already use हो चुका है
        if ((mask & (1 << c)) != 0) {
            return 0;
        }

        // color add करो
        mask = mask | (1 << c);

        int max = 0;

        for (int child : tree.get(node)) {
            max = Math.max(max, dfs(child, mask));
        }

        return 1 + max;
    }

    public static void main(String[] args) {

        int n = 5;

        int[] parent = {0, 1, 2, 1, 3};
        color = new int[]{0, 4, 3, 4, 3, 5};

        tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        // build tree
        for (int i = 2; i <= n; i++) {
            tree.get(parent[i - 1]).add(i);
        }

        int[] queries = {4, 3, 3};
        int total = 0;

        for (int q : queries) {
            total += dfs(q, 0);
        }

        System.out.println(total); // Output: 5
    }
} {
    
}
