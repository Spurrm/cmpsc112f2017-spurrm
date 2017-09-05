import java.util.Scanner;
import java.util.Random;
public class rps{
int userScore =0;
int compScore =0;
int numOfTies =0;
public static String getUserChoice(){
System.out.println("Please enter Rock, Paper, or Scissors to play the game!");
Scanner scan = new Scanner(System.in);
String choice = scan.next().toUpperCase();
return choice;
}

public static String generateCompChoice(){
System.out.println("The computer has chosen the following: ");
String compChoice = "";
Random rand = new Random();
int choice = rand.nextInt(3);
if (choice == 0)
compChoice  = "Rock";
else if (choice ==1)
compChoice = "Paper";
else
compChoice = "Scissors";

return compChoice;
}
public static int computerRoundWinner(String u, String c){
int result;
//0 means user is winner
//1 means comp is winner
//2 means it's a tie
if (u.equals(c))
result = 2;
else if (u.equals("Rock") && c.equals("Paper"))
result = 1;
else if (u.equals("Rock") && c.equals("Scissors"))
result = 0;
else if (u.equals("Paper") && c.equals("Rock"))
result = 0;
else if (u.equals("Paper") && c.equals("Scissors"))
result = 1;
else if (u.equals("Scissors") && c.equals("Paper"))
result = 0;
else if (u.equals("Scissors") && c.equals("Rock"))
result = 1;
return result;
}
//main function
	public static void main(String[] args){
		System.out.println("This is the RPS program. Let's get started!");
//user will enter a choice
String userChoice = getUserChoice();
//System.out.println(userChoice);
//generate choice for computer
String compChoice = generateCompChoice();
//comparison of the two choices
int winner = computerRoundWinner(userChoice, compChoice);
System.out.println(winner);

switch (winner){
case 0:
	System.out.println("Hey User, you won! Congratulations!!!!");
//userScore++;
break;

case 1:
	System.out.println("Sorry User, you lost. Better luck next time.");
//compScore++;
break;

case 2: 
	System.out.println("This round is a TIE");
//numOfTies++;
default:
break;
}
//based on the comparison, I will compute who the winner is
	}
}
