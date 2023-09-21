import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        int number = romanToInt(roman);
        System.out.println(number);

    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                number = number - map.get(s.charAt(i));
            } else {
                number = number + map.get(s.charAt(i));
            }
        }
        return number;
    }
}