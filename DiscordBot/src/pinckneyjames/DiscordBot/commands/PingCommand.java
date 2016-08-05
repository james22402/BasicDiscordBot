package pinckneyjames.DiscordBot.commands;

import net.dv8tion.jda.events.message.MessageReceivedEvent;
import pinckneyjames.DiscordBot.Command;

/**
 * Created by James on 8/5/2016.
 */
public class PingCommand implements Command {

    private final String HELP = "~!ping";

    public boolean called(String[] args, MessageReceivedEvent event)
    {
        return true;
    }

    public void action(String[] args, MessageReceivedEvent event)
    {
        event.getTextChannel().sendMessage("PONG");
    }

    public String help()
    {
    return HELP;
    }

    public void executed(boolean success, MessageReceivedEvent event)
    {
    }

}
