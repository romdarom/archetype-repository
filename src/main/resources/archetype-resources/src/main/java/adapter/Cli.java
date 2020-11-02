package ${groupId}.adapter;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "app", mixinStandardHelpOptions = true, subcommands = {
		CommandLine.HelpCommand.class }, description = "Command related to all resaerch apps")
public class Cli {

}
