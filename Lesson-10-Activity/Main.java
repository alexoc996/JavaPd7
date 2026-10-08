
// Challenge 1:
// Write a function "gpa" that takes in the GPA value and returns the calcuation:
// if it's over 90, return gpa * 1.1, otherwise return the raw gpa.
//


    // Challenge 1: GPA Calculation
// Challenge 2:
// Write a function "isGraduating" that accepts the grade level and number of credits earned
// that returns the boolean value TRUE if a student is a Senior and has 44 or more credits,
// otherwise return FALSE.



// In the init function:
// Display to console "Student is Graduating" or "Student is NOT Graduating" depending on the
// value returned by the function.
//
// Challenge 3:
// BMI
// Write a function "BMI" that accepts a weight in pounds and height in inches.
// Calculate the BMI (google the formula) and return the following:
//     BMI 18.4 or less return Underweight
//     BMI is 18.5 - 24.9 (inclusive) return Normal
//     BMI is 25.0 - 39.9 (inclusive) return Overweight
//     BMI is 40.0 or greater return Obese

       
// Challenge 4:
// Write a function "shippingCost" that accepts a weight in units of pounds and returns:
//     - 0.00, if 10 pounds or less,
//     - 5.00, if more than 10 pounds but 15 pounds or less,
//     - 10.00, if more than 15 pounds but 25 pounds or less,
//     - 10.00 Plus 2 cents per pound over 25 pound, if over 25 pounds.



// Challenge 5:
// Write a function "blueOrViolet" that accepts a light frequency in THz units and returns true
// for either blue frequency (600-670 THz) or violet frequency (700-750 THz), otherwise false.

class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init() {
		
	}

	// Challenge 1:
	// Write a function "gpa" that takes in the GPA value and returns the calculation:
	// if it's over 90, return gpa * 1.1, otherwise return the raw gpa.
	double gpa(double gpaValue) {
		if (gpaValue > 90) {
			return gpaValue * 1.1;
		}
		return gpaValue;
	}

	// Challenge 2:
	// Write a function "isGraduating" that accepts the grade level and number of credits earned
	// that returns the boolean value TRUE if a student is a Senior and has 44 or more credits,
	// otherwise return FALSE.
	boolean isGraduating(String gradeLevel, int creditsEarned) {
		return gradeLevel != null && gradeLevel.equalsIgnoreCase("Senior") && creditsEarned >= 44;
	}

	// Challenge 3:
	// BMI: write a function "BMI" that accepts a weight in pounds and height in inches.
	// Calculate the BMI and return the category.
	String BMI(double weightInPounds, double heightInInches) {
		double bmi = (weightInPounds * 703) / (heightInInches * heightInInches);
		if (bmi <= 18.4) {
			return "Underweight";
		} else if (bmi <= 24.9) {
			return "Normal";
		} else if (bmi <= 39.9) {
			return "Overweight";
		} else {
			return "Obese";
		}
	}

	// Challenge 4:
	// Write a function "shippingCost" that accepts a weight in units of pounds and returns:
	// 0.00 if 10 pounds or less,
	// 5.00 if more than 10 but 15 or less,
	// 10.00 if more than 15 but 25 or less,
	// 10.00 plus 2 cents per pound over 25 if over 25 pounds.
	double shippingCost(double weightInPounds) {
		if (weightInPounds <= 10) {
			return 0.00;
		} else if (weightInPounds <= 15) {
			return 5.00;
		} else if (weightInPounds <= 25) {
			return 10.00;
		} else {
			return 10.00 + (0.02 * (weightInPounds - 25));
		}
	}

	// Challenge 5:
	// Write a function "blueOrViolet" that accepts a light frequency in THz units and returns true
	// for either blue frequency (600-670 THz) or violet frequency (700-750 THz), otherwise false.
	boolean blueOrViolet(double frequencyInTHz) {
		return (frequencyInTHz >= 600 && frequencyInTHz <= 670)
				|| (frequencyInTHz >= 700 && frequencyInTHz <= 750);
	}
}