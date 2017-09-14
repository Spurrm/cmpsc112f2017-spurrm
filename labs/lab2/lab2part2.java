import java.util.Scanner;
import java.util.Random;

public class lab2part2{

  public static void main(String[] args){
    int num1,user,comp, counter = 0;
    int upperLimit = 100;
    int lowerLimit = 0;
    String answer, yes;
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("Would you like me to guess a number? (yes/no)"); //prints this line
    answer = scan.next();  //lets user input an asnwer
    if (answer.equals("yes")){

    }
    while(answer.equals("yes")){      //while asnwer = yes, this loop will run

      System.out.println("Hello! I'm thinking of a number between 1 and 100");
      System.out.println("Can you guess it right??");

      num1 = rand.nextInt(100) +1;    //randomly generates a number
      System.out.println("Here is the computer guess: " + num1);
      user = scan.nextInt();    //lets user input a number
      while(user != 0){         //while user does not equal 0, this loop will run
        if(user == 1){      //if user = 1, this if statement will run
          System.out.println("Computer guess is too high.. guess again: ");
          upperLimit = num1 - 1;    //makes computer generate a lower number
          num1 = ((upperLimit + lowerLimit)/2);   //makes user generate generate a lower number each time 1 is entered
          System.out.println("Here is the computer guess: " + num1);
          user = scan.nextInt();
          counter++;    //counts how many guesses
        }
        else{   // is user = -1, this else statement will run
          System.out.println("Computer guess is too low.. guess again: ");
          lowerLimit = num1 + 1;      //makes computer generate a higher number
          num1 = ((upperLimit + lowerLimit)/2);   //makes computer generate a higher number each time -1 is entered
          System.out.println("Here is the computer guess: " + num1);
          user = scan.nextInt();
          counter++;
        }
        if(user == 0){      //if user = 0, this if statement will run
          System.out.println("Computer guess is correct");
          System.out.println("It took me " + counter + " guesses to get it right.");    //prints out how many guesses it took for computer to correctly guess your number

        }

      }
      System.out.println("Would you like to play again?? (yes/no) ");
      answer = scan.next();

    }
  }
}
