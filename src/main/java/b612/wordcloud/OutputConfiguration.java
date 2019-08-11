package b612.wordcloud;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class OutputConfiguration {
    public Integer min = -1;
    public Integer max = -1;
    public Boolean orderByFrequency = false;

    public void parseArgs(String[] args) throws ParseException {
        Options options = new Options();
        options.addOption("min", "minCount", true, "Min frequency for output");
        options.addOption("max", "maxCount", true, "Max frequency for output");
        options.addOption("obf", "orderByFrequency", false, "Max frequency for output");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse( options, args);

        if(cmd.hasOption("min")) {
            this.min = Integer.parseInt(cmd.getOptionValue("min"));
        }
        if(cmd.hasOption("max")) {
            this.max = Integer.parseInt(cmd.getOptionValue("max"));
        }
        if(cmd.hasOption("obf")) {
            this.orderByFrequency = true;
        }
    }
}
