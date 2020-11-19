import java.awt.*;
import java.awt.image.BufferedImage;

class SepiaImageConverter extends ImageTemplate {

    public SepiaImageConverter() {
        super();
    }

    @Override
    public void convertImage(BufferedImage image) {
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                Color color = new Color(image.getRGB(x, y));
                int grey = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                int outputRed = 230 * grey / 255;
                int outputGreen = 180 * grey / 255;
                int outputBlue = 150 * grey / 255;
                image.setRGB(x, y, new Color(outputRed, outputGreen, outputBlue).getRGB());
            }
        }
    }

    @Override
    void setPath() {
        path = "s_" + path;
    }
}