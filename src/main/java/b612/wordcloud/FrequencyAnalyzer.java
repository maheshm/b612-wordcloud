package b612.wordcloud;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FrequencyAnalyzer {

	public FrequencyAnalyzer() {
		//Bad thing about storing instances at class level
		Word.words = new ArrayList<>();
	}
	
    public void loadData(InputHandler source) {
        List<String> input = source.getDataStream();
        input.stream()
            .map(i -> Word.add(i))
            .collect(Collectors.toList());
    }
}
