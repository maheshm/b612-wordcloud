package b612.wordcloud;

import org.apache.commons.cli.ParseException;
import java.util.Map;

public class WordCloudCore {
    private InputConfiguration inputConfig = new InputConfiguration();
    private OutputConfiguration oc = new OutputConfiguration();
    
    public WordCloudCore(String[] cmdLineArgs) throws ParseException {
        this.inputConfig.parseArgs(cmdLineArgs);
        this.oc.parseArgs(cmdLineArgs);        
    }

    public void setInputFile(String fileName) {
        this.inputConfig.setInputFile(fileName);
    }

    public void setInputData(String data) {
        this.inputConfig.setInputData(data);
    }

    public Map<String, Integer> getWordCloud() {
        FrequencyAnalyzer fa = new FrequencyAnalyzer();
        InputHandler source = this.inputConfig.source;

        fa.loadData(source);
        
        OutputHandler oh = new CsvHandler(this.oc);
        return(oh.getFrequencies());
    }
}
