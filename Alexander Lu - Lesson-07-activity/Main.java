
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
    System.out.println("Challenge 1: y = x^7");
    System.out.print("Enter x: ");
    double xValue = Input.readDouble();
    double yValue = Math.pow(xValue, 7);
    System.out.println("y = " + yValue);

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.

    System.out.println("\nChallenge 2: q = z^3 + 5");
    System.out.print("Enter z: ");
    double zValue = Input.readDouble();
    double qValue = Math.pow(zValue, 3) + 5;
    System.out.println("q = " + qValue);
  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    


    System.out.println("\nChallenge 3: s = t^5(r + 2)^4");
    System.out.print("Enter t: ");
    double tValue = Input.readDouble();
    System.out.print("Enter r: ");
    double rValue = Input.readDouble();
    double sValue = Math.pow(tValue, 5) * Math.pow(rValue + 2, 4);
    System.out.println("s = " + sValue);

 
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/

    System.out.println("\nChallenge 4: C = sqrt(A + B)");
    System.out.print("Enter A: ");
    double aValue = Input.readDouble();
    System.out.print("Enter B: ");
    double bValue = Input.readDouble();
    double cValue = Math.sqrt(aValue + bValue);
    System.out.println("C = " + cValue);

/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
        System.out.println("\nChallenge 5: distance between two points");
        System.out.print("Enter x1: ");
        double x1Value = Input.readDouble();
        System.out.print("Enter y1: ");
        double y1Value = Input.readDouble();
        System.out.print("Enter x2: ");
        double x2Value = Input.readDouble();
        System.out.print("Enter y2: ");
        double y2Value = Input.readDouble();
        double distance = Math.sqrt(Math.pow(x2Value - x1Value, 2)
                + Math.pow(y2Value - y1Value, 2));
        System.out.println("d = " + distance);



/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/
        System.out.println("\nChallenge 6: g = sin(deg)");
        System.out.print("Enter degrees: ");
        double degrees = Input.readDouble();
        double gValue = Math.sin(Math.toRadians(degrees));
        System.out.println("g = " + gValue);




/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
*/
    System.out.println("\nChallenge 7: k = m^5 / sqrt(n + 1)");
    System.out.print("Enter m: ");
    double mValue = Input.readDouble();
    System.out.print("Enter n: ");
    double nValue = Input.readDouble();
    double kValue = Math.pow(mValue, 5) / Math.sqrt(nValue + 1);
    System.out.println("k = " + kValue);
    

/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/

    



    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}