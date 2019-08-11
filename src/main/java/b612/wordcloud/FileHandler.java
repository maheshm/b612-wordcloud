package b612.wordcloud;
import java.util.List;

public class FileHandler implements InputHandler {
    private List<String> data = null;

    public void setData(String data) {
        this.data = cleanseData(data);
    }
    public FileHandler(String file) {
        //Get this input by reading file
        String input = new String("hello, hello,   WhAt is your, is, is, name, hello, what, hello, what, hello, what");
        this.setData(input);
    }

    public List<String> getDataStream() {
        return(data);
    }
}
