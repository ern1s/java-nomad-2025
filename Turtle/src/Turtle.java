public class Turtle {
    private int x = 0;
    private int y = 0;
    private String direction = "RIGHT";

    public void forward() {
        switch (direction) {
            case "UP" -> y--;
            case "DOWN" -> y++;
            case "LEFT" -> x--;
            default -> x++;
        }
        printState("Forward");
    }

    public void turnLeft() {
        direction = switch (direction) {
            case "UP" -> "LEFT";
            case "LEFT" -> "DOWN";
            case "DOWN" -> "RIGHT";
            default -> "UP";
        };
        printState("Turn left");
    }

    public void turnRight() {
        direction = switch (direction) {
            case "UP" -> "RIGHT";
            case "RIGHT" -> "DOWN";
            case "DOWN" -> "LEFT";
            default -> "UP";
        };
        printState("Turn right");
    }

    private void printState(String action) {
        System.out.println(action + " -> x=" + x + ", y=" + y + ", dir=" + direction);
    }

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.forward();
        turtle.forward();
        turtle.turnLeft();
        turtle.forward();
        turtle.turnRight();
        turtle.forward();
    }
}
