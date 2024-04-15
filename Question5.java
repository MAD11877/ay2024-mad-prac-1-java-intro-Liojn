import java.util.Scanner;
import java.util.HashMap;

public class Main
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    HashMap<Integer, Integer> numbers = new HashMap<Integer,Integer>();
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();

    for (int i = 0; i < num; i++) {
        int num1 = in.nextInt();
        if (numbers.containsKey(num1)) {
            numbers.put(num1, numbers.get(num1) + 1);
        } else {
            numbers.put(num1, 1);
        }
    }

    int max = 0;
    int mode = 0;
    for (int key : numbers.keySet()) {
        if (numbers.get(key) > max) {
            max = numbers.get(key);
            mode = key;
        }
    }
    System.out.println(mode);
}
}
