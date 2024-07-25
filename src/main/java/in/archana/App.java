
package in.archana;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{



	private static float add(float a, float b) { return a + b; }

	private static float subtract(float a, float b) { return a - b; }
	
	private static float multiply(float a, float b) { return a * b; }
		
	private static float div(float a, float b) { return a / b; }
	

	public static void main(String[] args) {
		String input = null;
		try (Scanner s = new Scanner(System.in);) {
			do {
				float a = 0, b = 0;
				System.out.println("what you wanna do ? \n1. Addition \n2.Subtraction \n3.Multiplication "
						+ "\n4.Division \n select any one option...");
				int request = s.nextInt();
				if (request < 5 && request > 0) {
					System.out.println("Enter first number");
					a = s.nextFloat();
					System.out.println("Enter second number");
					b = s.nextFloat();
				}
				switch (request) {
				case 1:
					System.out.println(add(a, b));
					break;
				case 2:
					System.out.println(subtract(a, b));
					break;
				case 3:
					System.out.println(multiply(a, b));
					break;
				case 4:
					System.out.println(div(a, b));
					break;
				default:
					System.out.println("Operation Not Found..!");
					break;
				}
				System.out.println("Do more calculations Y/N ?");
				input = s.next();

			} while ("y".equalsIgnoreCase(input));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}

