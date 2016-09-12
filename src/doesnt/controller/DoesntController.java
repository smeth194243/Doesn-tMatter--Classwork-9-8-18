package doesnt.controller;

import java.util.Scanner;

public class DoesntController 
{
	private String myName;
	private Scanner readKeyboardInput;
	
	public DoesntController()
	{
		myName = "Seth Morris";
		readKeyboardInput= new Scanner (System.in);
	}
	
	public void start ()
	{
		System.out.println("This is slightly less stupid :D");
		System.out.println(myName);
		askQuestions();
		
	}
	private void askQuestions()
	{
		System.out.println("What is your name?");
		String userInput = readKeyboardInput.nextLine();
		System.out.println("You said: " + userInput);
		
		System.out.println("Shall we play a game?");
		String gameInput = readKeyboardInput.next();
		System.out.println("you said: " + gameInput );
		
		System.out.println("Great. Lets Begin. What is 9+10?");
		int mathInput = readKeyboardInput.nextInt();
		System.out.println("You said: " + mathInput);
		
		System.out.println("Very Good. What is your GPA?");
		float gpaInput = readKeyboardInput.nextFloat();
		System.out.println("You said: " + gpaInput);
	
		
		
	}
}
