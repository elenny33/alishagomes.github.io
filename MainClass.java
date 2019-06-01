import java.util.Scanner;
import java.awt.Graphics;

public class MainClass extends TaskTimer
{


	public static void main(String[] args) 
	{
		System.out.println("Welcome to: ");
		System.out.println("");
		System.out.println(" ____    ____         ____  _____          _             ______    _                  __                 _     _______  __                                          \n" + 
				"|_   \\  /   _|       |_   \\|_   _|        (_)          .' ____ \\  / |_               |  ]               / |_  |_   __ \\[  |                                         \n" + 
				"  |   \\/   |   .---.   |   \\ | |   ,--.   __   _ .--.  | (___ \\_|`| |-'__   _    .--.| | .---.  _ .--. `| |-'   | |__) || |  ,--.   _ .--.   _ .--.  .---.  _ .--.  \n" + 
				"  | |\\  /| |  / /'`\\]  | |\\ \\| |  `'_\\ : [  | [ `/'`\\]  _.____`.  | | [  | | | / /'`\\' |/ /__\\\\[ `.-. | | |     |  ___/ | | `'_\\ : [ `.-. | [ `.-. |/ /__\\\\[ `/'`\\] \n" + 
				" _| |_\\/_| |_ | \\__.  _| |_\\   |_ // | |, | |  | |     | \\____) | | |, | \\_/ |,| \\__/  || \\__., | | | | | |,   _| |_    | | // | |, | | | |  | | | || \\__., | |     \n" + 
				"|_____||_____|'.___.'|_____|\\____|\\'-;__/[___][___]     \\______.' \\__/ '.__.'_/ '.__.;__]'.__.'[___||__]\\__/  |_____|  [___]\\'-;__/[___||__][___||__]'.__.'[___]    \n" + 
				"                                                                                                                                                                    ");
		System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("A message from the creators: ");
		System.out.println("McNair students often struggle with the concept of time management and the idea of not procrastinating and to ensure that students complete their homework assignments and projects on time. ");
		System.out.println("A lot of people, including us, often find ourselves entangled in the mess and headache that McNair gives to us and we struggle to prorate the amount of work correctly. ");
		System.out.println("This led to create an idea of creating a program that will help students who are struggling in this category.");
		System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("  __     _   _       _                                                  \n" + 
				" /_ |   | \\ | |     | |                                                 \n" + 
				"  | |   |  \\| | ___ | |_ ___  ___                                       \n" + 
				"  | |   | . ` |/ _ \\| __/ _ \\/ __|                                      \n" + 
				"  | |_  | |\\  | (_) | ||  __/\\__ \\                                      \n" + 
				"  |_(_) |_| \\_|\\___/ \\__\\___||___/    _       _                         \n" + 
				" |__ \\     / ____|    | |            | |     | |                        \n" + 
				"    ) |   | (___   ___| |__   ___  __| |_   _| | ___                    \n" + 
				"   / /     \\___ \\ / __| '_ \\ / _ \\/ _` | | | | |/ _ \\                   \n" + 
				"  / /_ _   ____) | (__| | | |  __/ (_| | |_| | |  __/                   \n" + 
				" |____(_) |_____/ \\___|_| |_|\\___|\\__,_|\\__,_|_|\\___|                   \n" + 
				"  ____     _______        _      _______ _                              \n" + 
				" |___ \\   |__   __|      | |    |__   __(_)                             \n" + 
				"   __) |     | | __ _ ___| | __    | |   _ _ __ ___   ___ _ __          \n" + 
				"  |__ <      | |/ _` / __| |/ /    | |  | | '_ ` _ \\ / _ \\ '__|         \n" + 
				"  ___) |     | | (_| \\__ \\   <     | |  | | | | | | |  __/ |            \n" + 
				" |____(_)   _|_|\\__,_|___/_|\\_\\    |_|  |_|_| |_| |_|\\___|_|            \n" + 
				" | || |    / ____|    | |              | |                              \n" + 
				" | || |_  | |     __ _| | ___ _ __   __| | __ _ _ __                    \n" + 
				" |__   _| | |    / _` | |/ _ \\ '_ \\ / _` |/ _` | '__|                   \n" + 
				"    | |_  | |___| (_| | |  __/ | | | (_| | (_| | |                      \n" + 
				"    |_(_)  \\_____\\__,_|_|\\___|_| |_|\\__,_|\\__,_|_|                      \n" + 
				"  _____    _______      _____          _      _     _                   \n" + 
				" | ____|  |__   __|    |  __ \\        | |    (_)   | |                  \n" + 
				" | |__       | | ___   | |  | | ___   | |     _ ___| |_                 \n" + 
				" |___ \\      | |/ _ \\  | |  | |/ _ \\  | |    | / __| __|                \n" + 
				"  ___) |     | | (_) | | |__| | (_) | | |____| \\__ \\ |_                 \n" + 
				" |____(_)  _ |_|\\___/  |_____/ \\___/__|______|_|___/\\__|           _    \n" + 
				"   / /    | |  | |    | |        / ____| |           | |          | |   \n" + 
				"  / /_    | |__| | ___| |_ __   | (___ | |_ _   _  __| | ___ _ __ | |_  \n" + 
				" | '_ \\   |  __  |/ _ \\ | '_ \\   \\___ \\| __| | | |/ _` |/ _ \\ '_ \\| __| \n" + 
				" | (_) |  | |  | |  __/ | |_) |  ____) | |_| |_| | (_| |  __/ | | | |_  \n" + 
				"  \\___(_) |_|  |_|\\___|_| .__/  |_____/ \\__|\\__,_|\\__,_|\\___|_| |_|\\__| \n" + 
				"                        | |                                             \n" + 
				"                        |_|                                             ");
		System.out.print("");
		
		Scanner scan = new Scanner(System.in); 
		String str = scan.next();
		boolean isOkay = false; 
		
		if (str.equals("1"))
		{
			 Notes.main(null);
		}else if (str.equals("2"))
		{
			Schedule.main(null);
		}else if (str.equals("3"))
		{
			TaskTimer.main(null);
			
		}else if (str.equals("4"))
		{
			Calender.main(null);
		}else if (str.equals("5"))
		{
			ToDoList.main(null);
		}else if (str.equals("6"))
		{
			HelpStudent.main(null);
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
