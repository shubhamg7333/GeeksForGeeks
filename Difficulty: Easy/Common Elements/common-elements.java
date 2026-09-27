class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b) {

        ArrayList<Integer> ans = new ArrayList<>();

        int[] freq = new int[100001];

        // Count elements of a
        for (int x : a) {
            freq[x]++;
        }

        // Find common elements
        for (int x : b) {
            if (freq[x] > 0) {
                ans.add(x);
                freq[x]--;
            }
        }

        // Sort the answer
        Collections.sort(ans);

        return ans;
    }
}