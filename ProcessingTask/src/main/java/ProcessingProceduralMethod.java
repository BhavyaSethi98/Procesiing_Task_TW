import processing.core.PApplet;

public class ProcessingProceduralMethod extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static final int DIAMETER = 10;
    public static int X_POST_CIRCLE1 = 0;
    public static int X_POST_CIRCLE2 = 0;
    public static int X_POST_CIRCLE3 = 0;
    public static int X_POST_CIRCLE4 = 0;
    public static final int Y_POST_CIRCLE1 = HEIGHT/5;
    public static final int Y_POST_CIRCLE2 = (2*HEIGHT)/5;
    public static final int Y_POST_CIRCLE3 = (3*HEIGHT)/5;
    public static final int Y_POST_CIRCLE4 = (4*HEIGHT)/5;
    public static int SPEED_CIRCLE1 = 1;
    public static int SPEED_CIRCLE2 = 2;
    public static int SPEED_CIRCLE3 = 3;
    public static int SPEED_CIRCLE4 = 4;

    public static void main(String [] args){ PApplet.main("ProcessingProceduralMethod",args);}

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();

    }

    private void drawCircle4() {
        ellipse(X_POST_CIRCLE4,Y_POST_CIRCLE4, DIAMETER,DIAMETER);
        X_POST_CIRCLE4+=SPEED_CIRCLE4;
    }

    private void drawCircle3() {
        ellipse(X_POST_CIRCLE3,Y_POST_CIRCLE3, DIAMETER,DIAMETER);
        X_POST_CIRCLE3+=SPEED_CIRCLE3;
    }

    private void drawCircle2() {
        ellipse(X_POST_CIRCLE2,Y_POST_CIRCLE2, DIAMETER,DIAMETER);
        X_POST_CIRCLE2+=SPEED_CIRCLE2;
    }

    private void drawCircle1() {
        ellipse(X_POST_CIRCLE1,Y_POST_CIRCLE1, DIAMETER,DIAMETER);
        X_POST_CIRCLE1+=SPEED_CIRCLE1;
    }

}
