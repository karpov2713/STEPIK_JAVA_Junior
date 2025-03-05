public class Box {
    public double length;
    public double width;
    public double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) {
        this(size, size, size);
    }

    public Box() {
        this(10);
    }

    public Box(Box another) {
        this(another.height, another.width, another.height);
    }

    public void showInfo() {
        System.out.println("Width: " + width + " length: " + length + " Height: " + height);
    }
}
