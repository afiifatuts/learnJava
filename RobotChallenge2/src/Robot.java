import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Robot {
    private enum Direction{
        NORTH,
        EAST,
        SOUTH,
        WEST
    }

    private int[] coordinate = new int[2];
    private Direction direction;

    public Robot() {
    }

    public int[] getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(int[] coordinate) {
        this.coordinate = coordinate;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public boolean mainMenu1(){
        boolean temp = true;
        Scanner sc = new Scanner(System.in);
        List<String> validDirection = new ArrayList<String>();
    }
}
