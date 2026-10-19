class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

 void init(){
/*  
    Challenge 1:
    Create a variable to store and display its value (assign a value to each variable):
    1) student's age 
    2) number of people that live with you
    3) number of items in a cart 
*/
    int studentAge = 16;
    int peopleAtHome = 4;
    int cartItemCount = 7;
    System.out.println("Student age: " + studentAge);
    System.out.println("People who live with me: " + peopleAtHome);
    System.out.println("Items in cart: " + cartItemCount);


/*  
    Challenge 2:
    Create a variable to store and display its value (assign a value to each variable):
    1) temperature 
    2) student's GPA
    3) growth rate of your investment
*/
    double temperature = 72.5;
    double studentGpa = 3.8;
    double investmentGrowthRate = 0.06;
    System.out.println("Temperature: " + temperature);
    System.out.println("Student GPA: " + studentGpa);
    System.out.println("Investment growth rate: " + investmentGrowthRate);
/*  
    Challenge 3:
    Create a variable to store and display its value (assign a value to each variable):
    1) Students last name 
    2) students first initial
    3) description of an item 
*/
    String studentLastName = "Garcia";
    char studentFirstInitial = 'A';
    String itemDescription = "blue backpack";
    System.out.println("Student last name: " + studentLastName);
    System.out.println("Student first initial: " + studentFirstInitial);
    System.out.println("Item description: " + itemDescription);
/*  
    Challenge 4:
    Create a variable to store and display its value (assign a value to each variable):
    1) the status whether lights are on
    2) the status whether the game is over
    3) the status whether the battery is charging
*/
    boolean lightsAreOn = true;
    boolean gameIsOver = false;
    boolean batteryIsCharging = true;
    System.out.println("Lights are on: " + lightsAreOn);
    System.out.println("Game is over: " + gameIsOver);
    System.out.println("Battery is charging: " + batteryIsCharging);
    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}
