import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface{
    private String filename;

    LoadHudDisplays(String filename){
        this.filename=filename;
    }

    @Override
    public ArrayList<String> load() {
        ArrayList<String> result = new ArrayList<>();
        try{
            FileReader reader = new FileReader(filename);
            BufferedReader buffReader = new BufferedReader(reader);
            String text = null;
            while((text=buffReader.readLine())!=null)
                result.add(text);
        }catch (IOException e){e.printStackTrace();}
        return result;
    }
}
