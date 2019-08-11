package b612.wordcloud;
import java.util.List;

public class StringInputHandler implements InputHandler {
    private List<String> data = null;

    public StringInputHandler(String data) {
        this.setData(data);
    }

    public void setData(String data) {
        this.data = cleanseData(data);
    }

    public List<String> getDataStream() {
        return(this.data);
    }
}
