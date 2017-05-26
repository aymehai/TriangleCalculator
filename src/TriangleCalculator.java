import java.util.Scanner;
import java.lang.Math;

public class TriangleCalculator {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Pleas enter the first side");
		double side1 = keyboard.nextDouble();
		System.out.println("Please enter the second side");
		double side2 = keyboard.nextDouble();
		System.out.println("Please enter the third side");
		double side3 = keyboard.nextDouble();
		double bothSidesSqrd = (Math.pow(side1, 2) + Math.pow(side2, 2));
		double side3Srqd = Math.pow(side3, 2);

		if (side1 == side2 && side2 == side3) {
			System.out.println("This triangle is an equilateral triangle");
		}

		else if (bothSidesSqrd == side3Srqd) {
			System.out.println("This is a right triangle");

		}

		else {
			System.out.println("this is just a regular triangle");
		}

	}

}
