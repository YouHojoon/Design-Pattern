import java.awt.*;
import java.awt.image.BufferedImage;


class GreyImageConverter extends ImageTemplate {

    public GreyImageConverter() {
        super();
    }

    @Override
    public void convertImage(BufferedImage image) {
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                // (x, y)�� �ش�Ǵ� �ȼ��� RGB ������ �޾Ƽ� Color�� ����
                Color color = new Color(image.getRGB(x, y));
                // RGB ���� ���� �о �÷� ��ȯ(���⼭�� ������� ��ȯ)
                int outputRed = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                int outputGreen = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                int outputBlue = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                // ���� ������� RGB ���� (x, y)��ǥ �ȼ� �÷��� ����
                image.setRGB(x, y, new Color(outputRed, outputGreen, outputBlue).getRGB());
            }
        }
    }

    @Override
    void setPath() {
        path = "g_" + path;
    }
}