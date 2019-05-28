/*
Written by: Alisha, Elenny, Aryan
If you are not us, go away! 
*/

//need to know how to access a class when the user picks an option 

import java.util.Scanner;
import java.awt.Graphics;
public class MainClass 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to: ");
		System.out.println("");
		System.out.println("███╗   ███╗ ██████╗███╗   ██╗ █████╗ ██╗██████╗     ███████╗████████╗██╗   ██╗██████╗ ███████╗███╗   ██╗████████╗    ██████╗ ██╗      █████╗ ███╗   ██╗███╗   ██╗███████╗██████╗     \n" + 
				"████╗ ████║██╔════╝████╗  ██║██╔══██╗██║██╔══██╗    ██╔════╝╚══██╔══╝██║   ██║██╔══██╗██╔════╝████╗  ██║╚══██╔══╝    ██╔══██╗██║     ██╔══██╗████╗  ██║████╗  ██║██╔════╝██╔══██╗    \n" + 
				"██╔████╔██║██║     ██╔██╗ ██║███████║██║██████╔╝    ███████╗   ██║   ██║   ██║██║  ██║█████╗  ██╔██╗ ██║   ██║       ██████╔╝██║     ███████║██╔██╗ ██║██╔██╗ ██║█████╗  ██████╔╝    \n" + 
				"██║╚██╔╝██║██║     ██║╚██╗██║██╔══██║██║██╔══██╗    ╚════██║   ██║   ██║   ██║██║  ██║██╔══╝  ██║╚██╗██║   ██║       ██╔═══╝ ██║     ██╔══██║██║╚██╗██║██║╚██╗██║██╔══╝  ██╔══██╗    \n" + 
				"██║ ╚═╝ ██║╚██████╗██║ ╚████║██║  ██║██║██║  ██║    ███████║   ██║   ╚██████╔╝██████╔╝███████╗██║ ╚████║   ██║       ██║     ███████╗██║  ██║██║ ╚████║██║ ╚████║███████╗██║  ██║    \n" + 
				"╚═╝     ╚═╝ ╚═════╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═╝╚═╝  ╚═╝    ╚══════╝   ╚═╝    ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═══╝   ╚═╝       ╚═╝     ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝    \n" + 
				"                                                                                                                                                                                     ");                                                                                              
	   
		System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("A message from the creators: ");
		System.out.println("McNair students often struggle with the concept of time management and the idea of not procrastinating and to ensure that students complete their homework assignments and projects on time. ");
		System.out.println("A lot of people, including us, often find ourselves entangled in the mess and headache that McNair gives to us and we struggle to prorate the amount of work correctly. ");
		System.out.println("This led to create an idea of creating a program that will help students who are struggling in this category.");
		System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("   ___    __                                    _         __                          _      \n" + 
				"  / _ \\  / / ___  ___ _  ___ ___         ___   (_) ____  / /__      ___   ___  ___   (_)     \n" + 
				" / ___/ / / / -_)/ _ `/ (_-</ -_)       / _ \\ / / / __/ /  '_/     / _ \\ / _ \\/ -_) _        \n" + 
				"/_/    /_/  \\__/ \\_,_/ /___/\\__/       / .__//_/  \\__/ /_/\\_\\      \\___//_//_/\\__/ (_)       \n" + 
				"                                      /_/                                                    ");
		System.out.println("╔╗╔┌─┐┌┬┐┌─┐┌─┐                      \n" + 
	   		"║║║│ │ │ ├┤ └─┐                      \n" + 
	   		"╝╚╝└─┘ ┴ └─┘└─┘                      \n" + 
	   		"╔═╗┌─┐┬ ┬┌─┐┌┬┐┬ ┬┬  ┌─┐             \n" + 
	   		"╚═╗│  ├─┤├┤  │││ ││  ├┤              \n" + 
	   		"╚═╝└─┘┴ ┴└─┘─┴┘└─┘┴─┘└─┘             \n" + 
	   		"╔╦╗┌─┐┌─┐┬┌─╔╦╗┬┌┬┐┌─┐┬─┐            \n" + 
	   		" ║ ├─┤└─┐├┴┐ ║ ││││├┤ ├┬┘            \n" + 
	   		" ╩ ┴ ┴└─┘┴ ┴ ╩ ┴┴ ┴└─┘┴└─            \n" + 
	   		"╔═╗┌─┐┬  ┌─┐┌┐┌┌┬┐┌─┐┬─┐             \n" + 
	   		"║  ├─┤│  ├┤ │││ ││├─┤├┬┘             \n" + 
	   		"╚═╝┴ ┴┴─┘└─┘┘└┘─┴┘┴ ┴┴└─             \n" + 
	   		"╔╦╗┌─┐  ╔╦╗┌─┐  ╦  ┬┌─┐┌┬┐           \n" + 
	   		" ║ │ │   ║║│ │  ║  │└─┐ │            \n" + 
	   		" ╩ └─┘  ═╩╝└─┘  ╩═╝┴└─┘ ┴            \n" + 
	   		"╦ ╦┌─┐┬  ┌─┐  ╔═╗┌┬┐┬ ┬┌┬┐┌─┐┌┐┌┌┬┐  \n" + 
	   		"╠═╣├┤ │  ├─┘  ╚═╗ │ │ │ ││├┤ │││ │   \n" + 
	   		"╩ ╩└─┘┴─┘┴    ╚═╝ ┴ └─┘─┴┘└─┘┘└┘ ┴   ");
		
		Scanner scan = new Scanner(System.in); 
		String str = scan.next();
		boolean isOkay = false; 
		
		if (str.equals("Notes") || str.equals("notes"))
		{
			 
		}else if (str.equals("Schedule") || str.equals("schedule"))
		{
			
		}else if (str.equals("TaskTimer")|| str.equals("tasktimer"))
		{
			
		}else if (str.equals("Calender")|| str.equals("calender"))
		{
			
		}else if (str.equals("To Do List ")|| str.equals("to do list"))
		{
			
		}else if (str.equals("Help Student")|| str.equals("help student"))
		{
			
		}else 
		{
			isOkay = false; 
			while(isOkay==false )
				{
				System.out.println("There is no option called: " + str);
				System.out.println("Please enter a valid option");
				str = scan.next(); 
				if (str.equals("Notes") || str.equals("Schedule") || str.equals("TaskTimer") || str.equals("Calender") || str.equals("To Do List ") || str.equals("Help Student")|| str.equals("schedule")|| str.equals("tasktimer") || str.equals("calender") ||str.equals("notes") || str.equals("to do list") || str.equals("help student"))
				{
					isOkay = true; 
				}
				}
		}
	}

}
