class Solution {
    public String convertToCamelCase(String s) {
        

        StringBuilder sb = new StringBuilder();

        // s = s.trim();
        sb.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (s.charAt(i - 1) == ' ') {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    sb.append(s.charAt(i));
                }
            }
        }

        return sb.toString();
        // return s;
    }
}