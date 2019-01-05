

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * this class replace the scanner string input and out.println,
 * by giving a simulated input for a specific output,
 * therefore we can simulate user inpiut in junit testing.
 * @author venon arthur
 */
public class AskString {
  /**
   * the scanner to read user input.
   */
  private final Scanner scanner;
  /**
   * the variable to know what is printed on the console.
   */
  private final PrintStream out;

  /**
   *  this is the constructor to replace scanner and system.out.println.
   * @param in input (either simulated or from the console)
   * @param outParam the printed string to display before getting the input
   */
  public AskString(final InputStream in, final PrintStream outParam) {
    scanner = new Scanner(in);
    this.out = outParam;
  }

  /**
   * display a message and waits for a string input.
   * @param message to be displayed
   * @return the input
   */
  public final String ask(final String message) {
    out.println(message);
    return scanner.nextLine();
  }
  /**
   * display a message and waits for a boolean input.
   * @param message to be displayed
   * @return the input
   */
  public final boolean askBool(final String message) {
    out.println(message);
    return scanner.nextBoolean();
  }
  /**
   * display a message and waits for a double input.
   * @param message to be displayed
   * @return the input
   */
  public final double askDouble(final String message) {
    out.println(message);
    return scanner.nextDouble();
  }
  /**
   * display a message and waits for an int input.
   * @param message to be displayed
   * @return the input
   */
  public final int askInt(final String message) {
    out.println(message);
    return scanner.nextInt();
  }
   /**
   * return the print
   * @param message to be returned
   * @return the print
   */
  public final void askPrint(final String message) {
    return out.println(message);
  }

}
