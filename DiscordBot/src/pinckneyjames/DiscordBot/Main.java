package pinckneyjames.DiscordBot;

import net.dv8tion.jda.JDA;
import net.dv8tion.jda.JDABuilder;

public class Main {
	
	private static JDA jda;
	
	public static void main(String[] args)
	{
		
		try {
			jda = new JDABuilder().setBotToken("MjEwOTgyOTk4MTQzNzk1MjAx.CoWsyA.g4XFpN_g4XeqsScQU8MF-Co6oH4").buildBlocking();
			jda.setAutoReconnect(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
