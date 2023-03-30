package shape;

public class Square implements Resizeable{
    private double size;
    @Override
    public void resize(double percent) {
        size *= percent;
    }

    public Square(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }
}
