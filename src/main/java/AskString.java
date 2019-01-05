

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * this class replace the scanner string input and out.println,
 * by giving a simulated input for a specific output,
 * therefore we can simulate user inpiut in junit testing
 * @author venon arthur
 */
public class AskString {

  private final Scanner scanner;
  private final PrintStream out;

  /**
   *  this is the constructor to replace scanner and system.out.println.
   * @param in input (either simulated or from the console)
   * @param out the printed string to display before getting the input
   */
  public AskString(InputStream in, PrintStream out) {
    scanner = new Scanner(in);
    this.out = out;
  }

  /**
   * display a message and waits for a string input.
   * @param message to be displayed
   * @return the input
   */
  public String ask(String message) {
    out.println(message);
    return scanner.nextLine();
  }
  /**
   * display a message and waits for a boolean input.
   * @param message to be displayed
   * @return the input
   */
  public boolean askBool(String message) {
    out.println(message);
    return scanner.nextBoolean();
  }
  /**
   * display a message and waits for a double input.
   * @param message to be displayed
   * @return the input
   */
  public double askDouble(String message) {
    out.println(message);
    return scanner.nextDouble();
  }
  /**
   * display a message and waits for an int input.
   * @param message to be displayed
   * @return the input
   */
  public int askInt(String message) {
    out.println(message);
    return scanner.nextInt();
  }

}
