package ${groupId};

import picocli.CommandLine; 
import org.jboss.weld.environment.se.Weld;
import ${groupId}.adapter.Cli;

public class App 
{
    public static void main( String[] args )
    {
		try (var container = new Weld().initialize()) {
			final var cli = new CommandLine(new Cli());

			cli.execute(args);
		}
    }
}

