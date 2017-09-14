import java.util.Scanner;
import java.util.Random;

public class lab2{
  public static void main(String[] args){
    int num1,user,counter = 0;
    String answer,yes;
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("Would you like to play? (yes/no)"); //prints line
    answer = scan.next();         //lets user type in response
    if (answer.equals("yes")){
    }

    System.out.println("");
    while(answer.equals("yes")){        //While answer = yes, this loop will run
      System.out.println("Hello! I'm thinking of a number between 1 and 100");
      System.out.println("Can you guess it right??");

      num1 = rand.nextInt(100) +1;    //randomly generates a number

      System.out.println("Type in your guess...");
      user = scan.nextInt();
      counter++;        //counts my guess

      while(user != num1){    //while user does not equal num1, this loop will run
        if(user < num1){    //if user < num1, this if statement will run
          System.out.println("Your guess is to low..");
          user = scan.nextInt();
          counter++;
        }
        else{   //is user > num1, this else statement will run
          System.out.println("Your guess is too high..");
          user = scan.nextInt();
          counter++;

        }
        if(user == num1){   //if user = num1, then this if statement will run
          System.out.println("Congratulations, you guessed the number");
          System.out.println("");
          System.out.println("You guessed the corect number in " + counter + " guesses.");    //prints how many times it took to guess the correct answer
        }
      }
      System.out.println("Would you like to play again?? (yes/no) ");
      answer = scan.next();
    }

  }
}
