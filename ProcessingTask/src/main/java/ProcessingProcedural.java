import processing.core.PApplet;

public class ProcessingProcedural extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static final int DIAMETER = 10;
    private int xPost = 0;
    private static final int Y_POST = HEIGHT / 5;
    private int speed = 1;

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
        for (int i = 1; i <= 4; i++) {
            drawCircle((xPost * i), (Y_POST * i), DIAMETER);
        }
        move();
    }

    private void move() {
        xPost += speed;
    }

    private void drawCircle(int xPostCircle, int yPostCircle, int diameter) {
        ellipse(xPostCircle, yPostCircle, diameter, diameter);
    }
}
