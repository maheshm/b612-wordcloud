package b612.wordcloud;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CsvHandler implements OutputHandler {
    //We wont implement actual CSV output, but more of CSV styled
	private OutputConfiguration oc = null;
	
	public CsvHandler(OutputConfiguration oc) {
		this.oc = oc;
	}
	
    public Map<String, Integer> getFrequencies() {
    	Stream<Word> ws = Word.words.stream();
    	if(this.oc.min != -1) {
        	ws.filter(word -> word.getFrequency() >= this.oc.min);
        }
    	if(this.oc.max != -1) {
        	ws.filter(word -> word.getFrequency() <= this.oc.max);
        }
    	if(this.oc.orderByFrequency) {
    		ws.sorted((p1, p2)->p1.getFrequency().compareTo(p2.getFrequency())); 
    	} else {
    		ws.sorted((p1, p2)->p1.getWord().compareTo(p2.getWord())); 
    	}
        Map<String, Integer> output = ws
            .collect(Collectors.toMap(data -> data.getWord(), data -> data.getFrequency()));
        
        return(output);
    }
}
