package box;

class Box {
    private double length;
    private double width;
    private double height;

    public Box() {
        this(10);
    }

    public Box(Box another) {
        this(another.length, another.width, another.height);
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) {
        this(size, size, size);
    }

    void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box copy() {
        return new Box(this.length, this.width, this.height);
    }

    Box increase() {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }

    public void compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        if (currentVolume > anotherVolume) {
            System.out.println("Current > Another");
        } else if (currentVolume < anotherVolume) {
            System.out.println("Current < Another");
        } else {
            System.out.println("Current == Another");
        }
    }

    private double getVolume() {
        return length * width * height;
    }

    public void showVolume() {
        System.out.println(getVolume());
    }
}
