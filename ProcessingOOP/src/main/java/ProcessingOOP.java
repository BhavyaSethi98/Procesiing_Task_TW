
import processing.core.PApplet;

public class ProcessingOOP extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static final int DIAMETER = 10;
    public static final int Y_POST_CIRCLE1 = HEIGHT/5;
    public static final int Y_POST_CIRCLE2 = (2*HEIGHT)/5;
    public static final int Y_POST_CIRCLE3 = (3*HEIGHT)/5;
    public static final int Y_POST_CIRCLE4 = (4*HEIGHT)/5;
    public static int SPEED_CIRCLE1 = 1;
    public static int SPEED_CIRCLE2 = 2;
    public static int SPEED_CIRCLE3 = 3;
    public static int SPEED_CIRCLE4 = 4;
    ellipseCreate ellipseCreate1;
    ellipseCreate ellipseCreate2;
    ellipseCreate ellipseCreate3;
    ellipseCreate ellipseCreate4;


    public static void main(String [] args){ PApplet.main("ProcessingOOP",args);}

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
         ellipseCreate1 = new ellipseCreate(Y_POST_CIRCLE1, DIAMETER,SPEED_CIRCLE1);
         ellipseCreate2 = new ellipseCreate(Y_POST_CIRCLE2, DIAMETER,SPEED_CIRCLE2);
         ellipseCreate3 = new ellipseCreate( Y_POST_CIRCLE3, DIAMETER,SPEED_CIRCLE3);
         ellipseCreate4 = new ellipseCreate( Y_POST_CIRCLE4, DIAMETER,SPEED_CIRCLE4);
    }

    @Override
    public void draw() {
        drawCircle(ellipseCreate1);
        drawCircle(ellipseCreate2);
        drawCircle(ellipseCreate3);
        drawCircle(ellipseCreate4);
    }

    private void drawCircle(ellipseCreate ellipseCreate) {
        ellipse(ellipseCreate.width,ellipseCreate.height,ellipseCreate.diameter,ellipseCreate.diameter);
        speedIncrement(ellipseCreate);

    }

    private void speedIncrement(ellipseCreate ellipseCreate) {
        ellipseCreate.width+=ellipseCreate.speed;
    }

}
