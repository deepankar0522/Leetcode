import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flowght" };
        String out = getLongestCommonPrefix(strs);
        System.out.println(out); // fl
    }

    private static String getLongestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length - 1];
        int i = 0;
        int count = 0;
        while (i < start.length() && i < end.length()) {
            if (start.charAt(i) == end.charAt(i)) {
                count++;
                i++;
            } else {
                break;
            }
        }
        return start.substring(0, count);
    }
}