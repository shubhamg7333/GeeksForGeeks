
class Solution {
    public int countWords(String s) {
        int i = 0;
        int j = s.length() - 1;
        int n = s.length();
        int count = 0;

        for (i = 0; i < n; i++) {
            if (s.charAt(i) == ' ' || s.charAt(i) == '\t' || s.charAt(i) == '\n') {
                continue;
            } else {
                break;
            }
        }

        for (j = n - 1; j >= i; j--) {
            if (s.charAt(j) == ' ' || s.charAt(j) == '\t' || s.charAt(j) == '\n') {
                continue;
            } else {
                break;
            }
        }

        for (int z = i; z <= j; z++) {
            if (s.charAt(z) != ' ' && s.charAt(z) != '\t' && s.charAt(z) != '\n') {
                if (z == i || s.charAt(z - 1) == ' ' ||
                    s.charAt(z - 1) == '\t' || s.charAt(z - 1) == '\n') {
                    count++;
                }
            }
        }

        return count;
    }
}
