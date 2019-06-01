import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 
public class HelpStudent 
{
/* This class is going to give the user an option of: 
 * 1) motivatinal tips
 * 2) time management tips 
 * 
 * 
 * */
	public static void main(String[] args) 
	{
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("    __  __     __         _____ __            __           __     \n" + 
				"   / / / /__  / /___     / ___// /___  ______/ /__  ____  / /_    \n" + 
				"  / /_/ / _ \\/ / __ \\    \\__ \\/ __/ / / / __  / _ \\/ __ \\/ __/    \n" + 
				" / __  /  __/ / /_/ /   ___/ / /_/ /_/ / /_/ /  __/ / / / /_      \n" + 
				"/_/ /_/\\___/_/ .___/   /____/\\__/\\__,_/\\__,_/\\___/_/ /_/\\__/      \n" + 
				"            /_/                                                   ");
		System.out.println(" ");
		System.out.println("The intent of the program \"Help Student\" is to give the student motivational quotes, time management tips, and a person to talk to if they need help");
		System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("");
		System.out.println("Please pick one: ");
		System.out.println("1: RANDOM MOTIVATIONAL QUOTE ");
		System.out.println("2: TIME MANAGEMENT TIPS");
		System.out.println("3: TALK TO AN EXPERT ");
		System.out.println("4. MAIN MENU");
		
		Scanner scan = new Scanner (System.in);
		int scan1 = scan.nextInt();
		
		
		if(scan1==1)
		{
			motivationalQuote();
		}else if (scan1==2)
		{
			timeManagementTips();
		}else if (scan1==3)
		{
			convo(); 
		}else if (scan1 ==4)
		{
			MainClass.main(null);
		}
		
		else {
			System.out.println("Not valid number. Please try again");
			HelpStudent.main(null);
		}

	}
	
	public static void motivationalQuote ()
	{
		
		String [] quotes = {"Don’t let what you cannot do interfere with what you can do. – John Wooden",
				"Successful and unsuccessful people do not vary greatly in their abilities. They vary in their desires to reach their potential. - John Maxwell",
				"Strive for progress, not perfection - Unknown" ,
				"There are no shortcuts to any place worth going. - Beverly Sills",
				"Failure is the opprotunity to begin again more intelligently. - Henry Ford",
				"Our greatest weakness lies in giving up. The most certain way to succeed is always to try just one more time. - Thomas A. Edison",
				"You’ve got to get up every morning with determination if you’re going to go to bed with satisfaction. - George Lorimer",
				"Develop success from failures. Discouragement and failure are two of the surest stepping stones to success. - Dale Carnegie",
				"To be successful you must accept all challenges that come your way. You can’t just accept the ones you like. - Mike Gafka",
				"Success doesn’t come to you, you’ve got to go to it. - Marva Collins",
				"Successful and unsuccessful people do not vary greatly in their abilities. They vary in their desires to reach their potential. - John Maxwell",
				"Success means having the courage, the determination, and the will to become the person you believe you were meant to be. - George Sheehan",
				"Coming together is a beginning; keeping together is progress; working together is success. - Edward Everett Hale ",
				"The secret of your success is determined by your daily agenda. - John C. Maxwell"};
		Random rand = new Random ();
		for(int i = 0; i< 1; i++)
		{
			System.out.println("Your random quote is: ");
			int index = rand.nextInt(quotes.length);
			System.out.println(quotes[index]);
		}
				 
	}
	public static void timeManagementTips()
	{
		System.out.println(" ");
		System.out.println("Welcome to Time Management: ");
		System.out.println(" ");
		System.out.println("Please select an option: ");
		System.out.println("1: Read a random Time Management Article");
		System.out.println("2: Take a time management quiz ");
		Scanner scan2 = new Scanner (System.in);
		String option = scan2.nextLine();
		if (option.equals("1"))
		{
			String [] articles = {"Article by: Entrepreneur \n Lay the foundation for effectively managing your time.\n" + 
					"Delegating the appropriate amount of time to get adequate sleep, maintain a healthy diet and exercising regularly are all essential elements to improve both focus and concentration. Making the time to create a healthy lifestyle will help improve your efficiency throughout the day, allowing for more time to complete other tasks. \n Identify and evaluate how you are currently spending your time.\n" + 
					"If you drive to work, how do you pass the time during your commute? If you take a bus or train, how do you spend all those hours a week? How many audiobooks or language tapes could you have completed while in traffic last month? How many books could you read on the train while getting to and from work the next few weeks?\n" + 
					"\n" + 
					"These are the best times throughout your day to incorporate all those little things that you “wished” you had time for. Over time, these habits become a lifestyle, and you will find yourself well ahead of the pack. \n Say no to nonessential tasks and prioritize the ones of extreme value.\n" + 
					"Consider your goals and look at your schedule before agreeing to take on more work. If a task is time consuming but not necessarily important to the main goal, pass it off or add it to the bottom of the list. \n Never hesitate to take a break if needed.\n" + 
					"Everyone gets worn out from time to time and piling on more and more tasks leads to stress that will simply derail you from the mission at hand. Take a walk, go to the gym, get some fresh air or take that sick day you’ve been holding out on. Sometimes all we need is a moment of clarity and solitude to clear our overworked minds and recharge our bodies to give us that next big push.\n" + 
					"\n" + 
					"After all, time management is really life management. ",
					
					
					"Article by: MINDTOOLS \n “Time management” refers to the way that you organize and plan how long you spend on specific activities.\n" + 
					"\n" + 
					"It may seem counter-intuitive to dedicate precious time to learning about time management, instead of using it to get on with your work, but the benefits are enormous: \n Greater productivity and efficiency.\n" + 
					"\n A better professional reputation.\n" + 
					"\n Less stress \n Increased opprotunities for advancement \n Greater opprotunities to achieve important life and carrer goals \n Failing to manage your time effectively can have some very undesirable consequences: \n Missed Deadlines \n inefficient work flow \n Poor Work Quality \n A poor professional reputation and a stalled carrer \n Higher stress levels ",
					"Article by: Forbes \n  At the risk of sounding immodest, I'm going to admit that I'm good at managing my time.  Co-workers, clients and friends often comment on how much I can produce and the range of work I can cover. I think of myself as one of those people who just gets stuff done. (There's a dark side to this, in that I can be task-mastery and frustrated by distractions, but that's a post for another day.)\n" + 
					"\n" + 
					"So it's been a rude awakening for me this year when I've found myself dropping some balls -- or barely catching, as when a to-do pops in your mind like a last minute save. It seems I finally reached overload status between a demanding and varied work schedule, recurring travel, and a busy family -- and my well-honed systems started breaking down. For the first time in my life, I started thinking I needed a systematic approach to time management.\n" + 
					"\n" + 
					"I've coached my clients around time management for years, so luckily I had a well of advice to draw from and put into practice. In our overstuffed days, it's a typical professional lament to just have a few more hours in a day. We don't want much really, just to produce more, and better. Never mind that we're asked to do more than our predecessors were ever asked to do, and by the way, to do it around the clock.\n" + 
					"\n" + 
					"For all of you out there who want to get better at time management, I wish I had a magic bullet for you. All I can offer are my best tips. They've worked for me, and perhaps they will for you as well.",
			
					"Article by: Huffington Post \n Now, this story ― if you aren’t a time management nut like I am ― may seem insignificant. In fact, you may think missing the bus was the entire point. It isn’t. That woman didn’t say thank you, and I honestly don’t mind, but I think it’s a fantastic example of people not valuing one another’s time. By value, I mean, if you do something for someone ― like going out of your way to check that price tag ― you deserve a thank you. It doesn’t have to be money. Not all value equals money.\n" + 
					"There are so many tasks I need to do in a day in order to accomplish my goals. When someone is late to a meeting, or just doesn’t take the time as a serious commitment, I get frustrated. Of course, not everyone is like this, but you should be. I am a firm believer that if you aren’t early you’re late. I don’t care if you are there at 5:01, if we said we would meet at 5:00. Think that’s wrong or rude? It’s not. Be there at 4:58 and I can accept it.\n" + 
					"If you are on time you’re late, if you are early you are on time.\n" + 
					"“Better three hours too soon, than one minute too late.” - William Shakespeare\n" + 
					"If you aren’t valuing other people’s time, then you need to start, because if you don’t value other people, they won’t value you. But if you do value your time, and someone doesn’t value it, then you are in no way obligated to roll over for them and play dead on their time. That’s why, if you don’t value your own time, no one is obligated to do it for you either.\n" + 
					"So, why do you need to value your time? Just so people will respect you? Absolutely not, there is nothing to do with respect from other people in this. It is all about you, valuing your own time. It’s about not letting some jerk tell you they are going to underpay you and you letting them. If you’re a writer, an artist, or literally anyone, value yourself and value the time you have.\n" + 
					"Life is short, but it also is your forever.\n" + 
					"If someone offers you twenty dollars for six hours of work, tell them no. You are worth more than that. Value yourself. You are worth being paid enough to live on. You are worth the “Thank you,” for going out of your way to help someone else. It is worth it to make as much of your time as you absolutely can.\n" + 
					"How do you value your time? Where do you start? How can you make the most of it? These are questions I asked myself too. As a freelancer, I have let people walk all over me because I was broke and desperately needed the money. Now, I decide how much my time is worth per client and per project. I let someone wear me out with over a hundred little changes to a design, and I realized I was being played. I stood up to that person. It didn’t go well, but I sure as hell felt better after I kicked them to the curb. I am never going to let that happen to me again.\n" + 
					"I sat myself down and told myself, “Johannus, you are worth more than a few pennies per hour of your time.”\n" + 
					"“You are worth more than a few pennies…”\n" + 
					"As soon as you tell yourself you’re worth it, start acting like it. There is no other way to do this. I can’t walk you through a step-by-step process, but I wish I could. This comes from within you. What I can give you is some tips in the form of a step-by-step, though.\n" + 
					"Be Early: When you are late, you’re not valuing your time or anyone else’s.\n" + 
					"Use Your Time Wisely: Every second of the day matters. I spend every moment trying to learn something new, in fact you can use YouTube Channels, news articles, and more for this. I like to read articles like this one while in the bathroom—why waste valuable time? When I’m in the shower I play YouTube videos with information on Self Improvement and more. It is about utilizing every moment of your day in an effective manner.\n" + 
					"Check Your Priorities: What are you making important? Scrolling through Facebook? Shopping when you don’t need anything and you know you have work to do? It’s important to figure out what is a priority. Because when you’re late you are saying, “This isn’t important to me.” So, check your priorities and decide why it’s important to you.\n" + 
					"Stop Making Excuses or “Reasons”: I know this is one everyone hates to hear. Look, I’m sorry traffic held you up and you were late to an interview or a meeting, but why didn’t you leave early enough that you accounted for traffic? Stop making an excuse. The only good reasons for being late are being sick, injured, or dead—or someone close to you being so. I know that’s super morbid, but if you aren’t going to go or can’t make it, just call ahead of time and tell them.\n" + 
					"Small things matter: Everything, even little things make a difference toward working toward success, your goals, or whatever you are seeking to accomplish (Which is a goal, by the way.) Do the small things. Give your partner and extra kiss when you’ve been working late. Turn on a YouTube video about improving your life while you shower, use these small moments to have big impacts.\n" + 
					"Do only a few things at a time: This is a big one ― it’s easier to manage your time when you’re focused. So, only focus on one or two tasks at a time. Don’t bite off more than you can chew, set up a schedule so you can juggle all of your tasks in a timely manner.\n" + 
					"Focus on the present: Everything you are doing right now will benefit the future, but if you don’t focus right now on today, you get stuck in an infinite loop of, “I’ll do it tomorrow.” But tomorrow never comes, it just becomes another today—and you never do it. So, stop lying to yourself. Count down from 5 to 1 and at the count of 1, go and do it—TODAY!\n" + 
					"Don’t procrastinate: I did an entire video on this, and I will link it at the end of the article. You need to control procrastination—not revel in it. If you catch yourself ignoring the dishes to read your Facebook Newsfeed, or scrolling through Twitter, it’s time to reprioritize (see above). Procrastination kills creativity, it kills motivation, and it will do nothing but wear you out. Especially when you fall into a Facebook “debate” trap and spend the next few hours wasting your time, and theirs’. Just walk away. Turn off the computer if you must, and go do your work. If you’re an artist or a writer who needs to work at the computer, then turn your internet off for a bit. Or you can find some great links in the description of my YouTube Video that will help put locks on your social media to keep you off them.\n" + 
					"Last One, You’re in Control: Listen up, y’all. Your problems are no one else’s but your own. When you allow someone else to impact your life and take that control, you have decided to do so. Start making better choices. No longer allow other people to control your life, or to waste your time. This is all you. Take control.\n" + 
					"“The great dividing line between success and failure can be expressed in five words: “I did not have time.” Franklin Field\n" + 
					"It comes down to saying thank you to someone—even a stranger going out of their way for you. Walking for exercise when you don’t need to, but why waste an hour sitting around? Have faith in what you are capable of. Don’t let other people devalue you or make you feel worthless. Only you have that control. Not only did we save an hour of wasted time by walking home, we also saved five dollars, and I was able to use that bus money to get us some water for the trip home—way better investment if you ask me.\n" + 
					" "};
			Random rand = new Random ();
			for (int i = 0; i<1; i++)
			{
				System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________-");
				int index = rand.nextInt(articles.length);
				System.out.println(articles[index]);
			}
			
		}else if (option.equals("2"))
		{
			System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
			System.out.println("Time Management Quiz: ");
			System.out.println(" ");
			System.out.println("Question 1: I have handed in an assignment late 3 or more times this year");
			String s = scan2.nextLine();
			System.out.println("Question 2: I often sleep late because of school assignments ");
			String s1 = scan2.nextLine();
			System.out.println("Question 3: I don't make a schedule, to do list, calender, or planner");
			String s2 = scan2.nextLine();
			System.out.println("Question 4: I find it hard to keep a balanced life between school and friends");
			String s3 = scan2.nextLine();
			System.out.println("Question 5: I am not good at time management ");
			String s4 = scan2.nextLine();
			System.out.println("If you answered \" Yes \" for 3 or more questions you need to work on your time management ");
		
		}else 
		{
			System.out.println("Sorry, " + option+ " does not exist");
		}
		
		
		
	}
	public static void convo ()
	{
		System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("TALK TO AN EXPERT: ");
		
		System.out.println("Hello! You are talking to a time management expert. Let's chat! ");
		System.out.println(""); 
		System.out.println("Expert: Complete this sentence: I am bad at time management because ___________");
		System.out.println(""); 
		System.out.println("1. I get distracted often");
		System.out.println("2. I get overwhelmed"); 
		System.out.println("3. I don't understand my work"); 
		System.out.println("4. I am unorganized"); 
		System.out.println("5. I am unmotivated"); 
		Scanner scan4 = new Scanner (System.in);
		int scan = scan4.nextInt();
		if (scan ==1)
		{
			System.out.println("Turn off notifications on your tablet and phone\n" + 
					"\n" + 
					"Do this and say goodbye to all the interruptions you’ve been getting when you were supposed to be focusing on your schoolwork.\n" + 
					"\n" + 
					"This tip alone will make you a much more productive student."); 
			System.out.println("");
			
		
		}else if (scan ==2)
		{
			System.out.println("Many students overestimate what they can accomplish each day. When they don’t manage to complete everything they intended to, they get discouraged and lose motivation.\n" + 
					"\n" + 
					"So be realistic when you plan your day, and assume that there will be a few unforeseen interruptions."); 
			System.out.println("Finish every homework assignment at least one to two days before it’s due\n" + 
					"\n" + 
					"In this way, you’ll have time to check through your work thoroughly.\n" + 
					"\n" + 
					"And just in case something urgent pops up at the last minute, you’ll still be able to complete the assignment on time.");
		}else if (scan==3)
		{
			System.out.println("If you don’t understand a new concept, speak to your teacher right away\n" + 
					"\n" + 
					"If you do this, you’ll save a lot of time in the long run, because you’ll be clarifying your doubts as they arise."); 
		}else if (scan==4)
		{
			System.out.println("Keep an ongoing list of every single thing you have to do\n" + 
					"\n" + 
					"Don’t rely on your brain as a storage device.\n" + 
					"\n" + 
					"Instead, write down every single thing you need to do: assignments, projects, errands, etc.\n" + 
					"\n" + 
					"Review the list daily to ensure that you’re working on the most important task at any given time."); 
		}else if (scan==5)
		{
			System.out.println("If you don’t feel like doing work, set a timer for two minutes. Then tell yourself that you just need to focus for that amount of time.\n" + 
					"\n" + 
					"Chances are that once you’ve started work, you’ll continue even after the two minutes are up."); 
		}else {
			System.out.println("Invalid input. Please try again."); 
			HelpStudent.main(null);
		}
		
	}
	
}
