public class DocxDocConverter extends DocConverter{
    public DocxDocConverter() {
        super("docx");
    }

    @Override
    public void save(String fileName) {
        System.out.println(fileName+".docx로 변환하여 저장합니다.");
    }
}
