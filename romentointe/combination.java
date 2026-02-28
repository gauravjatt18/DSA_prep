import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start,
                           List<Integer> current, List<List<Integer>> result) {

        // Base case: if target becomes 0, we found a valid combination
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // If target becomes negative, stop exploring
        if (target < 0) {
            return;
        }

        // Try each candidate starting from 'start' index
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);  // Choose

            // Allow same number again → pass 'i'
            backtrack(candidates, target - candidates[i], i, current, result);

            current.remove(current.size() - 1);  // Backtrack
        }
    }
}