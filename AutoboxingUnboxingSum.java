 import java.util.*;

public class AutoboxingUnboxingSum {
    
    // Method to parse a list of strings into a list of Integers
    public static List<Integer> parseStringListToIntList(List<String> stringList) {
        List<Integer> intList = new ArrayList<>();
        for (String str : stringList) {
            intList.add(Integer.parseInt(str)); // Autoboxing: int to Integer
        }
        return intList;
    }
    
    // Method to calculate the sum of a list of Integers
    public static int calculateSum(List<Integer> intList) {
        int sum = 0;
        for (Integer num : intList) {
            sum += num; // Unboxing: Integer to int
        }
        return sum;
    }
    
    public static void main(String[] args) {
        // Example list of numeric strings
        List<String> stringNumbers = Arrays.asList("10", "20", "30", "40", "50");
        
        // Convert string list to integer list
        List<Integer> integerList = parseStringListToIntList(stringNumbers);
        
        // Calculate sum
        int sum = calculateSum(integerList);
        
        // Display the result
        System.out.println("Sum of the numbers: " + sum);
    }
}
 
    

