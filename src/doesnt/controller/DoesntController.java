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
	}
}
