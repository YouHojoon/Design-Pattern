import javax.swing.*;
import java.awt.*;

public class WeatherDisplay extends DisplayDecorator{
    private Display display;
    private JPanel panel;
    private LabelPanel labelPanel;

    WeatherDisplay(Display display, int width, int height){
        super(display,width,height);
        this.display=display;
    }

    @Override
    public int getWidth() {
        return display.getWidth()+super.getWidth();
    }

    @Override
    public int getHeight() {
        return display.getHeight()+super.getHeight();
    }

    @Override
    public JPanel create() {
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setMinimumSize(new Dimension(getWidth(), getHeight()));
        panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
        labelPanel = new LabelPanel();

        panel.add(display.create());
        panel.add(labelPanel.createPanel(getWidth(), getHeight()));
        return panel;
    }

    @Override
    public void show() {
        display.show();
        labelPanel.updateText("Weather: 온도: 20도, 습도: 60");
    }
}
