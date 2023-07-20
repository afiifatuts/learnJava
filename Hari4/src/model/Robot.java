package model;

public class Robot {
    private Position position;
    private Direction direction;

    public Robot(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public void moves(String commands){
        String[] commandArray = commands.split("");
        for (String command: commandArray) {
            //Commandnya ada A -> untuk maju, L -> untuk hadap kiri, R -> hadap kanan
            if (command.equals("A")){
                // A -> untuk maju
                if (this.direction==Direction.EAST){
                    position = position.getRight();
                }
                if (this.direction==Direction.NORTH){
                    position = position.getTop();
                }
                if (this.direction==Direction.SOUTH){
                    position = position.getBottom();
                }
                if (this.direction==Direction.WEST){
                    position = position.getLeft();
                }
            }

            if (command.equals("L")){
               // L -> untuk hadap kiri
                switch (direction){
                    case EAST :
                        direction = Direction.NORTH;
                        break;
                    case WEST:
                        direction = Direction.SOUTH;
                        break;
                    case SOUTH:
                        direction = Direction.EAST;
                        break;
                    case NORTH:
                        direction = Direction.WEST;
                        break;
                }
            }

            if (command.equals("R")){
                // L -> untuk hadap kiri
                switch (direction){
                    case EAST :
                        direction = Direction.SOUTH;
                        break;
                    case WEST:
                        direction = Direction.NORTH;
                        break;
                    case SOUTH:
                        direction = Direction.WEST;
                        break;
                    case NORTH:
                        direction = Direction.EAST;
                        break;
                }
            }
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "position=" + position +
                ", direction=" + direction +
                '}';
    }
}
