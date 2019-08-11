package b612.wordcloud;
import java.util.Arrays;
import java.util.List;

public interface InputHandler {
    public List<String> getDataStream();
    public void setData(String data);
    
    public default List<String> cleanseData(String data){
    	List<String> output = Arrays.asList(data.split("[\\?,.!;:\\s]+"));
    	return(output);
    }
    
}
