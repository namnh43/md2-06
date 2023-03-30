package shape;

public class Rectangle implements Resizeable{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.width *= percent;
        this.height *= percent;
    }
}
