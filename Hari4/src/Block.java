public class Block extends Rectangle {
    private Double height;

    public Block(Double length, Double width, Double height) {
        super(length, width);
        this.height = height;
    }

    public  Double getArea(){return 2 * (length*width+length*height+width*height);}
}
