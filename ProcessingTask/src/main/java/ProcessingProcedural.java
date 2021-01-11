import processing.core.PApplet;

public class ProcessingProcedural extends PApplet {

    private final int WIDTH = 600;
    private final int HEIGHT = 600;
    private final int DIAMETER = 10;
    private int xPost = 0;
    private final int HEIGHT_DIV = HEIGHT / 5;
    private final int maxBalls = 4;

    public static void main(String[] args) {
        PApplet.main("ProcessingProcedural", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        int speed = 1;
        for (int i = 1; i <= maxBalls; i++) {
            drawCircle((xPost * speed), (HEIGHT_DIV * i), DIAMETER);
            speed++;
        }
        xPost++;
    }

    private void drawCircle(int xPostCircle, int yPostCircle, int diameter) {
        ellipse(xPostCircle, yPostCircle, diameter, diameter);
    }
}
