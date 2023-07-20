import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Robot {
    private int x;
    private int y;
    private String dirrection;

    public Robot(int x, int y, String dirrection) {
        this.x = x;
        this.y = y;
        this.dirrection = dirrection;
    }

    public void move(String dir){
        if (dir.equals("A")){
            if (this.dirrection.equals("N")){
                this.y += 1;
                System.out.println("Moving North");
            } else if (this.dirrection.equals("E")) {
                this.x += 1;
                System.out.println("Moving East");
            }
            else if (this.dirrection.equals("S")) {
                this.y -= 1;
                System.out.println("Moving South");
            }
            else if (this.dirrection.equals("W")) {
                this.x -= 1;
                System.out.println("Moving West");
            }else{
                System.out.println("False input");
            }
        } else if (dir.equals("R") || dir.equals("L")) {
            changeDirection(dir);
        }else{
            System.out.println("False input");
        }
    }

    public void changeDirection(String dir){
        List<String> direction = new ArrayList<>(Arrays.asList("N","E","S","W"));
        int pos = direction.indexOf(this.dirrection);
        if (dir.equals("R")){
            if (pos == 0){
                this.dirrection = direction.get(0);
            }else {
                this.dirrection = direction.get(pos+1);
            }
            System.out.println("Turning Right");
        }
        if (dir.equals("L")){
            if(pos==0){
                this.dirrection = direction.get(3);
            }else {
                this.dirrection = direction.get(pos-1);
            }
            System.out.println("Turning Left");
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirrection() {
        return dirrection;
    }
}
