/* Exercise3.java
 * Interprets the BMI based on the weight and height entered by the user
 * author: Nadine Castro (ST# 301105146)
 */
package application;

import java.util.Scanner;

public class Exercise3 {

	private double _weightInPounds; //represents the weight entered in pounds
	private double _heightInFeet; //represents the height entered in feet

	public static void main(String[] args) {

		// Declarations & Initializations
		double bmi;
		Scanner input = new Scanner (System.in);
		Exercise3 self = new Exercise3();

		// Prompts the user to enter weight and height
		System.out.print("Enter your weight in pounds: ");
		self._weightInPounds = input.nextDouble();
		System.out.print("Enter your height in feet: ");
		self._heightInFeet = input.nextDouble();

		// Calculates and displays the BMI
		bmi = (self._weightInPounds *  0.453) / ((self._heightInFeet *  0.304) *  (self._heightInFeet *  0.304));
		System.out.printf("Your BMI is: %.2f \n", bmi);

		// Calls the calculateBmiDescription method
		System.out.println("The interpretation of your BMI is: " + self.calculateBmiDescription(bmi));

		input.close();

	}// end of main method


	// calculateBmiDescription method interprets the BMI value
	public String calculateBmiDescription(double bmi){
		String interpretation=null;

		if (bmi < 18.5){
			interpretation = "Underweight";
		}
		else if (bmi >= 18.5 && bmi <= 24.9){
			interpretation = "Normal";
		}
		else if (bmi >= 25.0 && bmi <= 29.9){
			interpretation = "Overweight";
		}
		else if (bmi >= 30){
			interpretation = "Obese";
		}

		return interpretation;
	}// end of calculateBmiDescription method

}// end of Exercise3 class
