public class Main {

    public static void main(String[] args) {
        ImageTemplate grayImageConverter = new GreyImageConverter();
        ImageTemplate inverseImageConverter = new InverseImageConverter();
        ImageTemplate sepiaImageConverter = new SepiaImageConverter();

        grayImageConverter.convert();
        inverseImageConverter.convert();
        sepiaImageConverter.convert();
    }
}
