import processing.core.PApplet;

public class SnowSketch extends PApplet {
    private final Snowflake[] flakes = new Snowflake[80];

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        for (int i = 0; i < flakes.length; i++) {
            flakes[i] = createFlake();
            flakes[i].y = random(-height, height);
        }
    }

    @Override
    public void draw() {
        background(15, 24, 45);
        fill(255);
        noStroke();

        for (Snowflake flake : flakes) {
            circle(flake.x, flake.y, flake.size);
            flake.y += flake.speed;
            flake.x += sin(frameCount * 0.03f + flake.sway) * 0.35f;

            if (flake.y > height) {
                Snowflake newFlake = createFlake();
                flake.x = newFlake.x;
                flake.y = -10;
                flake.speed = newFlake.speed;
                flake.size = newFlake.size;
                flake.sway = newFlake.sway;
            }
        }
    }

    private Snowflake createFlake() {
        return new Snowflake(random(width), -10, random(1.2f, 3.5f), random(4, 10), random(0, TWO_PI));
    }
}
