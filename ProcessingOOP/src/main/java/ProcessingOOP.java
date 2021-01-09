
import processing.core.PApplet;

import java.util.ArrayList;


public class ProcessingOOP extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;
    private static final int Y_POST = HEIGHT / 5;
    private static final int SPEED = 1;
    private Ball ball;
    ArrayList<Ball> ballArray = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("ProcessingOOP", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int numberOfBalls = 1; numberOfBalls <= 4; numberOfBalls++) {
            ball = new Ball(Y_POST * numberOfBalls, SPEED * numberOfBalls);
            ballArray.add(ball);
        }
    }

    @Override
    public void draw() {
        ballArray.forEach(ball -> ball.move());
    }

    private class Ball {
        int x_post_ball = 0;
        int y_post_ball;
        public static final int DIAMETER = 10;
        int speed;

        public Ball(int yPost, int speedOfBall) {
            this.y_post_ball = yPost;
            this.speed = speedOfBall;
        }

        public void move() {
            ellipse(x_post_ball, y_post_ball, DIAMETER, DIAMETER);
            x_post_ball += speed;
        }
    }
}
