package Assignment3;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
    
   Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of milligrams in drink:");
    
    int numOfMilligrams = scan.nextInt();
    int lethalDrinkCount = 10*1000 / numOfMilligrams;
    System.out.println("It would take about " + lethalDrinkCount + " drinks for a lethal overdose.");
    
    
  }
}