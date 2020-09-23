public class PdfDocConverter extends DocConverter{
    public PdfDocConverter() {
        super("pdf");
    }

    @Override
    public void save(String fileName) {
        System.out.println(fileName+".pdf로 변환하여 저장합니다.");
    }
}
