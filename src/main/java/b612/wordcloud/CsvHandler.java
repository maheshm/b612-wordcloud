package b612.wordcloud;

import java.util.Map;
import java.util.stream.Collectors;

public class CsvHandler implements OutputHandler {
    //We wont implement actual CSV output, but more of CSV styled

    public Map<String, Integer> getFrequencies() {
        Map<String, Integer> output = Word.words.stream()
            .collect(Collectors.toMap(data -> data.getWord(), data -> data.getFrequency()));
        return(output);
    }
}
