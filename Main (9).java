import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    mandate(); 
    System.out.println("How many rectangle make up the room?");         
    int recNum = input.nextInt(); 
    squareFloorFootage(recNum);    
  }
  /* Operations Methods: 2 double parameters for each calculator method and return one double for each. Create calculation methods for adding, subtracting, multiplying, and dividing. */
  public static double add(double a, double b){
    return a + b;
  }
  public static double sub(double a, double b){
    return a - b;
  }
  public static double mult(double a, double b){
    return a * b;
  }
  public static double div(double a, double b){
    if(b == 0){
      System.out.println("Cannot divide by 0");
      return -1;
    }
    return a / b;
  }
  /* Square Floor Footage Method: Take int of how many rectangles make up the room, then prompt the user for length and width for however many sections the user gives. Does not work for circular rooms and assumes shapes are right-angled shapes. */ 
  public static void squareFloorFootage(int recNum){
    Scanner scan = new Scanner(System.in);
    double areaRec = 0.0; 
    double areaTotal = 0.0; 
    for(int i = 1; i < recNum + 1; i++){
      System.out.println("Input length of Rectangle #"+ i);
      double l = scan.nextDouble();
      
      System.out.println("Input width of Rectangle #"+ i);
      double w = scan.nextDouble();
      areaRec = l * w; 
      areaTotal += areaRec; 
    }
    System.out.println("The area of the given room is " + areaTotal + " square feet."); 
  } 
  public static double totalWallArea(int wallNum){
    Scanner input = new Scanner(System.in);
    double area = 0.0; 
    for(int i = 0; i < wallNum; i++){
      System.out.println("Input length");
      double l = input.nextDouble();
      System.out.println("Input width");
      double w = input.nextDouble();
      area += l * w;
    }
    return area;
}
  /* Mandate: For all user prompts, print out what the method does and explain what the inputs are that it requires for the user. Ask for each value separately in different lines, so that the user only gives one value at a time so as to not confuse our delicate users. Make sure to include an output for unwanted outputs. */ 
  public static void mandate(){
    System.out.println(); 
      System.out.println("The add method adds two ints. This method requires two ints from the user."); System.out.println(); 
    System.out.println("The sub method subtracts two ints. This method requires two ints from the user."); System.out.println();     
    System.out.println("The mult method multiplies two ints. This method requires two ints from the user."); System.out.println(); 
    System.out.println("The div method divides two ints. This method requires two ints from the user."); System.out.println(); 
    System.out.println("The square footage methods takes an int of how many rectangles a room can be divided into. Then, for each rectangle, it takes the length and width of that rectangle, and repeats for each rectangle. The total square footage is printed at the end."); System.out.println(); 
    }
}