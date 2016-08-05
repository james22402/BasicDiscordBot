package pinckneyjames.DiscordBot;

import net.dv8tion.jda.JDA;
import net.dv8tion.jda.JDABuilder;
import pinckneyjames.DiscordBot.Utils.CommandParser;
import pinckneyjames.DiscordBot.commands.PingCommand;

import java.util.HashMap;

public class Main {

    private static JDA jda;
    public static final CommandParser parser = new CommandParser();

    public static HashMap<String, Command> commands = new HashMap<String, Command>();

    public static void main(String[] args) {
        try {
            jda = new JDABuilder().addListener(new BotListener()).setBotToken("MjEwOTgyOTk4MTQzNzk1MjAx.CoZvRA.k_va07hwuQfc7RbS0bUArIhs-7c").buildBlocking();
            jda.setAutoReconnect(true);
        } catch(Exception e) {
            e.printStackTrace();
        }

        commands.put("ping", new PingCommand());
    }

    public static void handleCommand(CommandParser.CommandContainer cmd)
    {
        if(commands.containsKey(cmd.invoke))
        {
            boolean safe = commands.get(cmd.invoke).called(cmd.args, cmd.event);

            if(safe)
            {
                commands.get(cmd.invoke).action(cmd.args, cmd.event);
                commands.get(cmd.invoke).executed(safe, cmd.event);
            }
            else
            {
                commands.get(cmd.invoke).executed(safe, cmd.event);
            }

        }
    }

}
