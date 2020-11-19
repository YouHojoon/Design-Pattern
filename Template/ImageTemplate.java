import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class ImageTemplate {

    private final String HOUSE = "house.png"; // 원본 영상 파일 이름
    protected String path;

    public ImageTemplate() {
        path = String.copyValueOf(HOUSE.toCharArray());
    }

    public final void convert() {
        try {
            // 이미지 파일 데이터를 메모리에 넣음
            BufferedImage image = ImageIO.read(new File(HOUSE));
            convertImage(image);
            setPath();
            ImageIO.write(image, "png", new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    abstract void convertImage(BufferedImage image);
    abstract void setPath();
}