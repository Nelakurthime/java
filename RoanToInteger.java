package java;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Mapping of Roman numerals to their integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);    romanMap.put('V', 5);
        romanMap.put('X', 10);   romanMap.put('L', 50);
        romanMap.put('C', 100);  romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int total = 0;
        int prevValue = 0;
        // Traverse the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(s.charAt(i));
            // If the current value is less than the previous value, subtract it
            if (currValue < prevValue) {
                total -= currValue;
            } else {
                total += currValue;
            }
            prevValue = currValue;
        }
        return total;
    }
    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"III", "IV", "IX", "LVIII", "MCMXCIV"};

        for (String roman : testCases) {
            int result = romanToInt(roman);
            System.out.println("Roman numeral: " + roman + " => Integer: " + result);
        }
    }
}
