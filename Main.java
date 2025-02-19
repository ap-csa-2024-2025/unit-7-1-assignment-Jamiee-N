import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";

    ArrayList<String> words = new ArrayList<String>();
    System.out.println("Please enter wods, enter STOP to stop the loop.");

    while (!input.equals("STOP"))
    {
      System.out.println("inside the loop. enter a word");
      input = sc.nextLine();
      words.add(input);
    }
    System.out.println("exited loop. Arraylist is now" + words);
    int lastIndex = words.size()-1;
    words.remove(lastIndex);
    System.out.println("removed the last word. list is now" + words);

    int len = words.size();
    if (len > 2)
    {
     String firstIndex = words.get(0);
    words.add(firstIndex);
    words.remove(0);
    System.out.println("the list is now" + words);
    }
  }
}
