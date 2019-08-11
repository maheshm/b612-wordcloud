package b612.wordcloud;

import java.util.Map;

import org.apache.commons.cli.ParseException;

public class App
{
    public static void main( String[] args ) throws ParseException
    {
        WordCloudCore wcc = new WordCloudCore(args);
        
        Map<String, Integer> output = wcc.getWordCloud();
        
        output.forEach((word, frequency) -> System.out.println(word + ", " + frequency));
    }
}
