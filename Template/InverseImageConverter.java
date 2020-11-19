import java.awt.*;
import java.awt.image.BufferedImage;


class InverseImageConverter extends ImageTemplate {

    public InverseImageConverter() {
        super();
    }

    @Override
    public void convertImage(BufferedImage image) {
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                Color color = new Color(image.getRGB(x, y));
                int outputRed = 255 - color.getRed();
                int outputGreen = 255 - color.getGreen();
                int outputBlue = 255 - color.getBlue();
                image.setRGB(x, y, new Color(outputRed, outputGreen, outputBlue).getRGB());
            }
        }
    }

    @Override
    void setPath() {
        path = "i_" + path;
    }
}