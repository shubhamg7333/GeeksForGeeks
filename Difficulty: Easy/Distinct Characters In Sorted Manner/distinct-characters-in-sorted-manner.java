
import java.util.*;

class Solution {
    String sortedDistinct(String s) {
        TreeSet<Character> set = new TreeSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        for (char ch : set) {
            result.append(ch);
        }

        return result.toString();
    }
}
