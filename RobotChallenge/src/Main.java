import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String dir;
        int x,y;
        String[] robotAtt;

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Tentukan posisi awal robot - pakai koma(,)");
        String input = scanner.nextLine();
        robotAtt = input.split(",");

        dir = robotAtt[0];

        x= Integer.parseInt(robotAtt[1]);
        y = Integer.parseInt(robotAtt[2]);

        System.out.println(Arrays.toString(robotAtt));

        Robot robot = new Robot(x,y,dir);

        while (true){
            String cmd = scanner.nextLine();
            if (cmd.equals("Q")){
                break;
            }else{
                robot.move(cmd);
                System.out.printf("Robot moving to %s to coordinate: \n x : %d, y : %d \n",robot.getDirrection(),robot.getX(), robot.getY());
            }
        }

    }
}