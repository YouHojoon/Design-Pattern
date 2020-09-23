public class OdfDocConverter extends DocConverter{

    public OdfDocConverter() {
        super("odf");
    }

    @Override
    public void save(String fileName) {
        System.out.println(fileName+".odf로 변환하여 저장합니다.");
    }
}
