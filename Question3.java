import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */

    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int numSquared = num * num;
    System.out.print(numSquared);
  }
}
