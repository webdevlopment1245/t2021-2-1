import java.util.*;

public class program4{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);

        
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0); 
        }

        
        for (Integer number : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }


        System.out.println("Output:");
        System.out.println(countMap);
    }
}
