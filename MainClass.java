import java.util.Scanner;
public class MainClass extends TaskTimer
{                
	/* Please choose one: 
	 * 1. Notes
	 * 2. Schedule
	 * 3. TaskTimer
	 * 4. Homework Help: Calculator 
	 * 5. ToDoList
	 * 6. Help Student 
	 * 
	 */

	public static void main(String[] args) 
	{
		System.out.println("+++++++ooooooooooooooooooysyyysyyssssssssssssssssyysssssssssssyyyyyssssyyyyyyyyyyyyyyyyyyyyyyyyyso+:-----..://+ohmNmmdhyss+::-----:/+:+/+hosyo/:--/oydNNNNNNNmmmdhyysssss++/oo+//+++soss+++/oo\n" + 
				"+++++++oooooooooooooooooooossyyyyyyssssssssssyyysssssssssssyyyyssssssssssyyyyyyyyyyyyyyyyyyyyso/:----..-:/oshmmmdhysos+/:-::-----/oo+ohoyo:--:+shdNmNNNNNNNmdhsssssso++::::/++oooyysoo+:-.--::\n" + 
				"++++++ooooooooooooooooooooooossyyhhyssssyyyyyssssssssssyyyyysssssssssyyyyyyyyyyyyyyyyyyyyso+/:---..-:/osymNNmhyssoo+/:::::---:/+y+syoo/-:/ohdhyo//s+dmmdhyyyssssoo+-----/:/+oso+++:....-:/:+//\n" + 
				"+++++o+ooooooooooooooooooossssssssyyhhhyyyysssssssssyyyyssssssssssssssyyssyyyyyyyyyyyso+/:----.-:/+sydNNmmhyooo++++/:/---://oyoys/:-:+ydmmmmy:://+oo/dsossooooooo++/:/++oso+:--/++:...-:/+++++\n" + 
				"oo++oooooooooooooooooooosssooossssssyyhyysssssssyyyysssssssssssssssssssssssyyyysssso/:----..::+oydmNNmhysoo+//+//:/--::o+shss+:-/oyhdmmmNmmdy+://:/++shsoossosssooo+o+//:--::::---:/+++///:--/\n" + 
				"+ooooooooooooooooooosssooooossssshhyhyssyssssyyyssssssssssssssssssssssssssssssso+/:---..-:+oydmNNmmdhs+oo+++/:--/o++yosyo+::+shhyo/:oNdhyssss/:::::/s/ohsssssssooo++++:::---://+o+//:---:/::::\n" + 
				"++oosooooooooooooossooooosssssssyyyssssssssysssssssssssssssssssssssssssssssoo/::---.-:/oydmmmmdsyso//:/+/::--:+o+ysso///+yhdmmho:::::hhssso++//-::::/o:yhsys+/::----/:--///-+o+::-----::::////\n" + 
				"+ooooosoooooooosoooooosssssssysssssssssssssssssssssssssssssssssssssssssso+/:---.-:/oshmmNddyso+//////:---//+soys++/+oydddmmmNNy::----+do//+++/-------/+:hy::::--.--:/++///::/:-::-:::::::/::::\n" + 
				"oooooooosoooooooooosssooossssssssssssssssssssssssssssssssssssssssssso+/:---.--/oshmmmmdhyoo++/////:--:/ooyoso//osyhdddmmNNNmdyo:-----:yo+/:----------:+/+y+---::/+//::----.....--------....-:/\n" + 
				"+oooooooosssoooooooooossyssoossssssssssssssssssssssssssssssssssso+//:--..-:+oydmmmdysso+////::--/o/+soyoo++oyyhhhdmNNNNdhysoooo:--------------------:::+/://+//:--------:--.....-:-...-/+oyhhh\n" + 
				"+oooooooooosssoooooossssoossssssssssssssssssssssssssssssssssso+/:--..-:+sso//dmhso+++///::--::/s+sooo+osyhyyhdmNNNmdhssooo++////---------::---:----:::::o:/:-..------:::::--.-//+s++shdddhhhhh\n" + 
				"ooooooooooooosssossssoossssssossssssssssssssssssssssssssso+/:--..--/oydmm/-.omy+++//::---:++ssssoosyyhhhddmNNNmdysooooo+//:::://:--------::---------:-::/+:/----::::::--:-.-:+yyhdddhhyyyssoyh\n" + 
				"ssooooooooooooosyssosssooooooossssssssssssssssssssssso+/:--...-/+oo/+ddyo-.-yh+////:-//+sssossyyyyyhdmmNNmdhssooo++/:/++///++oo+:-----------:---::------:+/:/------..-:+osyhdddhhyyyssssssssos\n" + 
				"syyyssooooooosssssssooooooooossssssssssssssssssssoo+::--..-:+syhd+--sho+:--/s/--:++soyosssssssyhdmNNNmdyso+++++/::-::/+ooooo+////----------:::------::::::o//:..-:/oyhdmmmdhsyssssssssssssoooo\n" + 
				"soossyysssssssooooossssooooooosssssssssssssssso+/:--..-:+oyhdmdds--:yo/:--.-::+ooysysyssoosydmNNNNmdhs++++///++:::/+oo+so//:::::::----------------:::::-:::o:/oydmmmdhhyyyyssossssssooo+//:::+\n" + 
				"oooooossyyyysooooooooosssooooosssssssssssso+/:-----:/oyhhdhysso+---:/:---:++ssyyyysoooshdmNNmdhdhyyss++//:::/+o+oo+//:/+/::://///--------------::::o+---:::/o:smhysssssssssyso+ooo+/::::/::://\n" + 
				"oooooossoossyyyssoooo+/sdyssoossosssssoo+/------/+syhddmy+/////::-/:+/o+ssyyhysoooshmmNmmhso++ssoo+++++//++oo+o+:::--:://///:--.-.---------:/+oss/:+/::-::::++:yhsssssssooooo++++///--:::::://\n" + 
				"oosssooooooooosyysso+/sddddhssoosoooo/:-----:/osyhdhddyo////+/--:+o+ysyyysos+oyhmmNmdhso//////o+++++++soooo+//+:--:-+o/:---------.---:----/o//+/:/::o--::::::o//hhsoo++//:::///+++/::://///+oo\n" + 
				"sssooooooooooo+/:/syyhdddddddhyso+/:----:/+oshhdyo++o++//::-:/++ysyyyo+/+oyddNNmdso///++/::::/o+++o+//y///:::::///:-::.----------..-----/-:/:-+/:+:-+---::::::o:/ds/::::::::+//o+++++ooosssoo+\n" + 
				"ooooooooooo+/:---:oohddddddddddd+/::::+osyhhdhs+///+//+::/+osyyys+//:-.+odNddyo++:::::+/-:://+s//:---:/://///:----...:-------...-:/:----+++o:--...::::.--:::::/o:odo::::::::///+oso+ssoo//::::\n" + 
				"ooooooo++/:----::+ohdhhhhdmmmmddsssosyhhhsoo+++//::::++osyyyo+::+shh/.-s+md+sy//+----:+++ooo++s----://-++:--------...:-....-:/ossso:--..:/:-...---+---...------/+:sd+::/+/++oooo//++oo+///////\n" + 
				"oooo++/:---:////+oddhhyhhdmddddds//hmdyo++++/::::/:..--::-.````.//:-``.--/:..:...```..-:-......``.--..`.`````````````..```.:::-..+++s-..-+--------.-.....-----:/s//hyooso+/:::-/--:+++o++//:::\n" + 
				"+++/:---:/oyyooosdddhhhhddmmmmmh/:ydyso+//:///+oss/                                                                             `sy:/-.`.:.............--:/osyhdhs:+hy:-............/+//:-----\n" + 
				"/:---:/sydho/::ohdddmdddmmmmmmm+:shs+/:://+osyso+:.                                                                              :+:/:...........--://++o+dmmmdddys/odo-....-.......:----://+/\n" + 
				"-::+shdhso/-/osyyhddmmmmmmmmmd+-oso::++sssso/::/oy+                                                                             `//----.-...-:/+syhh+/+osydmmdmmmddo/sd/.....------:////os+++/\n" + 
				"oyhdhso//++shyyyhdddddmmmmdy+:.-:ossyyo+/::+sydmNm+  Welcome to:                                                                `------:++oohdmddmmdhhdddmdddhddddddo/o/--::://++++o+/::::----\n" + 
				"hyo+:-:/ooshhhdddhhhhddddy+:-:+syyo+:::+shdmmmmdhy:                        _                          _                          `/+syhy++++odmdhhysoooyhdhysoyhddddh/y////++++//::-.....---::-\n" + 
				"/+::+oooyhhhhddddddhhdho+/+syso/:-/oyhmmmdysoyso+/`  |\\/| _|\\ |  _. o ._  (_ _|_      _|  _  ._ _|_  |_) |  _. ._ ._   _ ._     `ymmmmdyhdddddhooo+/:---+/---/hddmmmdhh++::-......-----::::/::\n" + 
				"/ososyyhyhhhhhdddddmddhyys+/-:/oydmmdhyoo+//+///+:-  |  |(_| \\| (_| | |   __) |_ |_| (_| (/_ | | |_  |   | (_| | || | (/_|      `hmdysosshddhys/-......-/:::///sdmmmmmdso-.--::::::::://:::/:-\n" + 
				"+osyssoshhhhhhhddddmmddo--/shmmmdyooo+/+:--+++++o:.                                                                             .hdhs+/:-.:/-..--.---:://///::-oydmmmdddds/::::::///::/:/:::/:\n" + 
				"hds+++shhhhddddddddddddo-osmdyso+++/--////+o:-:o:-.  Please choose one:                                                         `o+:-.....:-:-://////:--.-------:oddddmmmdhy/:::/::://::::---.\n" + 
				"ms/::sdddddddddhhhddmNh:osddsoo++++/++s/::s---::o/.  1. Notes                                                                   ....---:/+++/::----:---:::::+yhhhhhdmmmmmdhho/::/:---........\n" + 
				"+--:yddddmdddddddddmmh:osddsoooo+s/::s:-:+/::--:/-`  2. Schedule                                                                `://++/::---:::::/syyosyhsoooooyhyyddddddddhhhhyo/-......--:/o\n" + 
				":+ohddddddmdmmmmmmmmh:+sddsoos/:++:-:/::+:..--.:--`  3. TaskTimer                                                               `::------::/:/oyhhhdddhhy/-.-://oyhdddhhddddhhhhhhysoosyhdmmmm\n" + 
				"++hdddddddmmmmmmmdho:+shms//o::::o:---.-:-----:-.-`  4. Homework Help: Calculator                                               `/+oosysyhhsssssyhhhdmdhy::-...-:oydhdhdmmmmdmmmmNNNNNNmdhysss\n" + 
				"+hddddddmmmmmmmmdy:-+syho:/+::--::----.:-..-:/+//+-  5. ToDoList                                                                .yhhhhhhdhy:-//+oshhddddh/......-:odddddmmmmmmNNNNNNmmmdhysooo\n" + 
				"ddddddddmmmmmmmdy::+o//:::+-----:--..:o++shhy/o/::-  6. Help Student                                                            .hddddddmdo:::--:/shmmmNms...`...-/yddhhdmmmmmmNmmmmmmmmmmdyss\n" + 
				"dddddddmmmmmmmdy::/s+----::---:/-:/oyddddhso//--:/.                                                                             .dmmmmmmmmh-....--/ymmmNNm+:.....-:+hddhhdmmmmmmmmmmmmmddddhys\n" + 
				"ddddddmmmmmmmdy::/s+----::-:/oyyyysoshhhhso/:-.-..`                                                                             .dmmmmmmmmm:.....-:+hmNNNms.....:::/ohyhhydddddhhddddhhhhhyyss\n" + 
				"ddddmmmmmmmmmy/:/s+---:oyyyyysosoo+osso++/-..----:::ooo::+sso+oso+:--...-.-------.....-:/+++++/:://:/+oooooossssssssssssssssssssymmmmNNNNNmo.`...--/sdmmmmd-.``...-:/shhyhhddddddmmmmhsssooo++\n" + 
				"ddmmmmmmmmmmh/:/ssssyyyssossoooo+//+:::----://oyho+smmhyhdhy+///:::::/:.::----::/+oosyyyyyyyyyyyyys/:/+yhhhhdmmmmmmmmmmmmmmmmmmmmmmmmmmmmddh......-:+ymmmmmo.``....-:+yhhhhdmmmmdmNNd+/::::---\n" + 
				"dmmmmmmmmmmmh//symdsssssooo+/+/-.-/:-://syhyssdmhyhddhs+///:-://:::-----:/+osyyyyyyyyyyhhhhhhhhddh+-::+shhddmmmmmmmmmmmmmmmmmmmddddddddddddh-.....--/odmmmmh-.`....--:ohhhhhmmmmmmmNmy+:::::::\n" + 
				"mmmmmmmmmmmmo/ssmdysso+/++///+---/oossssdmdyyhdhy+///:-.-:-.--:-:://///oyyyyyyyyhhhhhhdddddddmmmmd:..-:+yhmmmmmmNNmmmmmmddddddddddddddddddhh/.....--:+ydmmmd+.......-:/shhhhdmmmmmmNNmdy+:::::\n" + 
				"mmmmmmmmmmmo/ssdd+//o///o+++o+//+s:--+yyhhs/:++/:--::///:::/+osso/+//oshhhhddddddddmmmmmmmmmmmmmmm-..-:+yhmmmmmNmmmmmdddddddddhhhhdhhhhhhhy+/......-:/ohmmmdh-.......-:+yhhhhdmmmmmmNNmy/:::::\n" + 
				"mmmmmmmmmmo/ssddo//oo++o+//oo-.-o/...+///::-/syo/::::::/syyyyyyyyyy+//oyhhhddmmNmmmmmmmmmmmmmmNmmd...-:+yhddmmmNmmmmddddddhhhhhhyyyyysso++:.-......--:+ydmddd+.......--/ohhhhhmmmmmmmNmdhso+//\n" + 
				"mmmmmmmmms:ssdds++oo/:oo--/s-..:+----:://///+oy+//+ossyyyhhhhhhdddh:-:+yhddmmmmmmNNNNNNNNmmmmmdddy...-:+yyddddmmmdddddhhhhyso//::++//::---..--`....--:/ohddddy-.......-:/shhhhdmmmmmmmNmmddh+/\n" + 
				"mmmmmdho/:sshmy::+o--/o:--//--/+//:::::/+/:/yshhhhdddddddmmmmmmmmms..-/yhdmmmmmmNNmmmmmmmmddddddds...-:+ys/yddmmmdddddhs/+++---:+so////::/+//+......-::+yhdddd+.......--:+yhhhhdmmmmmdmmdhhhyy\n" + 
				"mmmmmd+::oshdy:-:o---:/+//////+:---::/oyhys+shhhhddmmmNNNNmmmmmmmm:..:+yhmmmmmmNmmmmmdmddddddhdhho`..-:+so.shddmddddy+osso+:-..-::/-..../o++/:......--:/ohddddy........--:ohhhhhmmmmmmmNmyo+++\n" + 
				"mmmmdo::ososo/-//::::/o:-----/:----://oyhho:shhhdmmmmmmNNNNNNNmmmh..-:oyhddddmmmmdmdddddhhhyyyyss/`..-:+so.ohhdddddds/y/-..--..-:/:-...-............--:/oyddddd/........-:/shhhhdmmmmmmmmhsooo\n" + 
				"mmmdo::os////:/+:----/:-:----/-------:+syy-:yyhhmmmmmmmNNmmmmmmmd/..-/syysshddmmddddhyso/::/oo+/:.`..-:+so.ohhddddddho+....-+/++oy+/:::--............-::+shddddy.```.....-:+yhhhhdmmmmmmmmyo++\n" + 
				"mddo/:+yo:----/::::-:/:::---/-----:..:+yy:-syyhdNmmmmmNmmmmmmdddy..-:+ys:..yddmdddhsoooo-.:/+/---.`..-:+so.shhhdddhhy:.-://oyhyyyhdhyso/:--..........--:/oyddddh/``......--/ohhhhhmmmmmmmNdyo+\n" + 
				"dho//+so/:::-:::::--:-----/o/:/+os/.-/ss+.+yyyhmmmmmmmmmmdddhhys/`.-:oso..-yddmddh+oo/---.-/:/...`...-:+so.yhhhddhhhh///osyhddddodmddhhhyo+-..........--:+shddddy.`.......-:+yhhhhdmmmmmmmmhyo\n" + 
				"ho//+yo/::::::----+o//+osyhddddhso--:oss-/syyydmdhhmmmdddhso:-:+...-/ss/../hhdddddso...:///o+/:-.`...-:+so.yhhhdhhhhhyoshhddmdhy+yms/--::/+/-.........--:/oyddddd/...`....--:oyhhhhdmmmmmmmmhs\n" + 
				"o//+ys/--::oo/+osyhhhyssoshhhhys+-.:+sys/syyyymh/+ddmmddyso+-./:..-:+ss:..shhdddhh+.://shyyydyso:`...-:+so-yhhhdhhhhhhhhdddy+--.-+o:```````..-.........--:+shddddy.........-:/shhhhhdmmmmmmmmy\n" + 
				"+/+ysyosyyyyyssso+++o+++oyyyyyyo:.-/yyy+syyyyhd:.sddmdddh/.---+...-:oso..-yhhddhhh//oshddddsmmdhs....-:+so-yhhhddhhhhhhdmh/`````.....``````..`.........--:/oyddddd/.``.....--:+yhhhhhdhdddhhs/\n" + 
				"++yshdsooooooosoooosoooossoo+so:.-:shyysyyyyymo./hdddddhs::+soo...-/ss+../hhhddhhhsshhdmdhsodh/--`...-:+so-yhhhddhhhhhdmdo  ````.....```.`..............-:/+shddddy........--:/ohhhhhhhhdhhy:-\n" + 
				"+sshdyssssoooooo++o////o/--.:o:.-:+hhyyyyyyyhd--ydhddhhhsoyhdh/`.-:oss:..shhhddhhhhhdmds:.`.:-...`...-:+so:hhhhdhhhhhhmdhs``````........................--:/oyddddd/.`......--:+shhhhhddddhh+-\n" + 
				"yshdyoooo+//o+:::+/---//...-o/-.-/yhhyyyyyyymo.+dhdddhhhhddmmh...-/sys-.:hhhhdhhhhhdmd:...`````..`...-:oso:hhhydhhhhhdmdhy.``````...........----.........-:/+shddddy..`......--:+yhhhhhdhhhho-\n" + 
				"shdy:::o/::/+---/+---:+-..-+o:.-/ohhyyyyyyydh-/hdhddhhhddmmy/-`.-:+yyo..+hhhddhhhhdmmy......````.....-:oso:hhhhdhhhhhddddy.`````````.........---.........--:+ohddddd/.`.......-:/ohhhhhddddh+-\n" + 
				"hdy/--+/--:o:--:o:::/o+++++yo---+yhyyyyyyyym+/hdhhdhhhddmmd/-...-:oyy/..yhhhdhhhhhmmms--.............-:oso/hhhhdhhhhhddddh-````    ```.......---..........--/oydmdddy.``...-----:+yhhhhhddddh:\n" + 
				"dh/::+o/++so+++ss+++oy:-.-oy---:oys/yyyyyydh-sddhddhhddmmmy:-..-:/syy-.:hhhhdhhhhdmmd+----..........--:oyo/hhhhdhhhhhdddhh/`        ```......----..`...-----:+shddddd/.........-:/ohhhhhdddddy\n" + 
				"dyoosyooosy:::oy/::/y:.../h/--:osy/oyyyyyhm/:hdhhdhhddmmmm+:...-:+yys..+hhhhdhhhhdmmd/-----...``....-:/oso+hhhyhhhhhhdddhy+`         ``....------.:.--....--:/oydddddy-.``......-:/sdhhhhddddd\n" + 
				"h+/+yo+/oy/::+h+://s+...:yo--:+ss+-syyyyydy-odhhddddddmmmh:-...-:oyy+..yhhhhdhhhhdmmd:------...`....--/oyo+hhhyhhhhhhhddhhs``        ``.....-----.`---.....--:+shddddd/`````....--:+yddddddddd\n" + 
				"o//ys//+y/::/yo://+s::::+s-.-/+ss-/yyyyyhm/-hdhhddddddmmms--..-:/syy:.:hhhhdhhhhhmmmd--------.......-:/os++hhhyhhhyhhhddhhs``        ``....-----...........--:/ohdddddy.`````....-:/shdddddddd\n" + 
				"");
	
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
			DoNotEnterSign.main(null);
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
