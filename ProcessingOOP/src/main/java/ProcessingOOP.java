
import processing.core.PApplet;

import java.util.ArrayList;


public class ProcessingOOP extends PApplet {

    private final int WIDTH = 600;
    private final int HEIGHT = 400;
    private final int HEIGHT_DIV = HEIGHT / 5;
    private Ball ball;
    private final int maxBalls = 4;
    ArrayList<Ball> balls = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("ProcessingOOP", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int ball_no = 1; ball_no <= maxBalls; ball_no++) {
            ball = new Ball(HEIGHT_DIV * ball_no, ball_no);
            balls.add(ball);
        }
    }

    @Override
    public void draw() {
        balls.forEach(ball -> ball.drawAndMove());
    }

    private class Ball {
        int x_post = 0;
        int y_post;
        private final int DIAMETER = 10;
        int speed;

        public Ball(int yPost, int speedOfBall) {
            this.y_post = yPost;
            this.speed = speedOfBall;
        }

        public void drawAndMove() {
            ellipse(x_post, y_post, DIAMETER, DIAMETER);
            x_post += speed;
        }
    }
}
