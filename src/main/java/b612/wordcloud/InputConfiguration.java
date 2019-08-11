package b612.wordcloud;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class InputConfiguration {

    public InputHandler source = null;

    public InputConfiguration() {}

    public void parseArgs(String[] args) throws ParseException {
        Options options = new Options();
        options.addOption("f", "fileName", true, "CSV file");
        options.addOption("i", "input", true, "Input string");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse( options, args);

        if(cmd.hasOption("f")) {
            String fileName = cmd.getOptionValue("f");
            this.setInputFile(fileName);
        }
        else if(cmd.hasOption("input")) {
            String data = cmd.getOptionValue("input");
            this.setInputData(data);
        }
        else {
            System.out.println("No data input specified");
            System.exit(0);
        };
    }

    public void setInputFile(String fileName) {
        this.source = new FileHandler(fileName);
    }

    public void setInputData(String data) {
        this.source = new StringInputHandler(data);
    }

}
