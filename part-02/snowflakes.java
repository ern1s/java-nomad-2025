import processing.core.PApplet;

public class Part2 extends PApplet {

    int maxCount = 120;   // Максимум снежинок
    int currentCount = 0; // Сколько сейчас на экране

    float[] x = new float[maxCount];
    float[] y = new float[maxCount];
    float[] speed = new float[maxCount];
    float[] rotation = new float[maxCount];
    float[] rotationSpeed = new float[maxCount];
    float[] size = new float[maxCount];

    int lastSpawnTime = 0;    // время последнего появления снежинки
    int spawnInterval = 150;  // задержка появления (меньше → быстрее рождаются)

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        // Пустой экран — не заполняем массивы
    }

    @Override
    public void draw() {
        background(0);

        stroke(255);
        strokeWeight(2);
        noFill();

        // Создаём новые снежинки постепенно
        if (currentCount < maxCount && millis() - lastSpawnTime > spawnInterval) {
            spawnSnowflake(currentCount);
            currentCount++;
            lastSpawnTime = millis();
        }

        // Рисуем снежинки
        for (int i = 0; i < currentCount; i++) {

            pushMatrix();
            translate(x[i], y[i]);
            rotate(rotation[i]);

            drawSnowflake(size[i]);

            popMatrix();

            // Падение
            y[i] += speed[i];
            rotation[i] += rotationSpeed[i];
            x[i] += sin(rotation[i]) * 0.5;

            // Перезапуск, если снежинка упала
            if (y[i] > height) {
                spawnSnowflake(i);
                y[i] = 0;
            }
        }
    }

    // Создание одной снежинки
    void spawnSnowflake(int i) {
        x[i] = random(width);
        y[i] = random(-200, -20);          // рождаются выше экрана
        speed[i] = random(1, 3);
        rotation[i] = random(0, TWO_PI);
        rotationSpeed[i] = random(-0.02f, 0.02f);
        size[i] = random(10, 25);
    }

    // Рисуем снежинку
    void drawSnowflake(float s) {
        for (int i = 0; i < 6; i++) {
            line(0, 0, s, 0);
            line(s * 0.6f, 0, s * 0.8f, s * 0.2f);
            line(s * 0.6f, 0, s * 0.8f, -s * 0.2f);
            rotate(PI / 3);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Part2");
    }
}