import java.util.Scanner;

public class ClassroomArea {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		double length;
		double width;
		double height;
		String userInput;

		do{
			System.out.println("Welcome to Grand Circus' Room Detail Generator!\n");

			System.out.print("Enter Length: ");
			length = scnr.nextDouble();
			System.out.print("Enter Width: ");
			width = scnr.nextDouble();
			System.out.print("Enter Height: ");
			height = scnr.nextDouble();

			double area = length * width;
			double perimeter = ((length * 2) + (width * 2));
			double volume = (length * height * width);

			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);

			System.out.println("Continue? (y/n): ");
			userInput = scnr.next();
			userInput = userInput.toLowerCase();
		} while (userInput.equals("y"));
		System.out.print("Bye");
	}

}
