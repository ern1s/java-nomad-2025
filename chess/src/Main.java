import processing.core.PApplet;

public class Main extends PApplet {
    private int boardSize = 8;
    private int cellSize = 70;

    @Override
    public void settings() {
        size(560, 560);
    }

    @Override
    public void draw() {
        background(220);
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                if ((row + col) % 2 == 0) {
                    fill(240, 217, 181);
                } else {
                    fill(181, 136, 99);
                }
                rect(col * cellSize, row * cellSize, cellSize, cellSize);

                if (mouseX > col * cellSize && mouseX < (col + 1) * cellSize &&
                    mouseY > row * cellSize && mouseY < (row + 1) * cellSize) {
                    fill(255, 0, 0, 90);
                    rect(col * cellSize, row * cellSize, cellSize, cellSize);
                }
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
