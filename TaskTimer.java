import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TaskTimer 
{
	public static int howLong;
	public static Timer timer;

public static void main(String[] args) {
 
    System.out.println("Welcome to: ");
    System.out.println("");
	System.out.println("  ______           __      _______                        \n" + 
			" /_  __/___ ______/ /__   /_  __(_)___ ___  ___  _____    \n" + 
			"  / / / __ `/ ___/ //_/    / / / / __ `__ \\/ _ \\/ ___/    \n" + 
			" / / / /_/ (__  ) ,<      / / / / / / / / /  __/ /        \n" + 
			"/_/  \\__,_/____/_/|_|    /_/ /_/_/ /_/ /_/\\___/_/         \n" + 
			"                                                          ");
	Scanner scan2 = new Scanner(System.in);
    System.out.print("How many seconds do you want to do this task: ");
    String sec = scan2.nextLine();
    if (sec.equals("exit"))
    {
    	MainClass.main(null);
    }
    
    int delaySeconds= 1000;
    int total = 1000;
    timer = new Timer();
    howLong = Integer.parseInt(sec);
    System.out.println(sec);
    timer.scheduleAtFixedRate(new TimerTask() {

        public void run() 
        {
        	
            System.out.println(setInterval());
        	

        }
    }, delaySeconds, total);
}

private static final int setInterval() {
    if (howLong == 1)
    {
    	timer.cancel();
    	System.out.println("███████╗████████╗ ██████╗ ██████╗     \n" + 
    			"██╔════╝╚══██╔══╝██╔═══██╗██╔══██╗    \n" + 
    			"███████╗   ██║   ██║   ██║██████╔╝    \n" + 
    			"╚════██║   ██║   ██║   ██║██╔═══╝     \n" + 
    			"███████║   ██║   ╚██████╔╝██║         \n" + 
    			"╚══════╝   ╚═╝    ╚═════╝ ╚═╝         \n" + 
    			"                                      \n" + 
    			"");
    }

    return -- howLong ;    
}
}
