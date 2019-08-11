package b612.wordcloud;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class Word {

    public static List<Word> words = new ArrayList<>();

    private final String word;
    private Integer frequency;

    public static String add(String word) {
        Optional<Word> found = words.stream()
            .filter(w -> w.word.equals(word.toLowerCase()))
            .findFirst();
        found.ifPresent(f -> f.addOneMore());
        if(found.isEmpty()) { new Word(word.toLowerCase()); }

        return word;
    }

    public Word(final String word) {
        this.word = word;
        this.frequency = 1;
        words.add(this);
    }

    public void addOneMore() {
        this.frequency += 1;
    }

    public Integer getFrequency() {
        return(this.frequency);
    }

    public String getWord() {
        return(this.word);
    }
}
