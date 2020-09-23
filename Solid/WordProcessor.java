import java.util.HashMap;
import java.util.Map;

public class WordProcessor {
    private ISpellChecker spellChecker;
    private Map<String, DocConverter> docConverters=new HashMap<>();
    private String fileName;
    WordProcessor(String fileName){
        this.fileName=fileName;
    }
    public void addDocConverter(DocConverter converter){
        docConverters.put(converter.getExtension(),converter);
    }
    public void convertDocTo(String ext){
        if(!docConverters.containsKey(ext)){
            System.out.println(ext+"파일 형식을 지원하는 DocConverter가 없습니다.");
            return;
        }
        docConverters.get(ext).save(fileName);
    }
    public void setSpellChecker(ISpellChecker spellChecker){
        this.spellChecker=spellChecker;
    }
    public void checkSpelling(){
        spellChecker.check();
    }


}
