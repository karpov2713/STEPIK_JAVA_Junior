public class Box {
    double length;
    double width;
    double height;

    public Box() {
        this(10);
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(double size){
        this(size, size, size);
    }

    void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    void compare(Box another){
        double currentVolume = getVolume();
        double anotherVolume = getVolume();
        if(currentVolume > anotherVolume){
            System.out.println("Current > Another");
        } else if (currentVolume < anotherVolume) {
            System.out.println("Current < Another");
        } else {
            System.out.println("Current == Another");
        }
    }

    double getVolume() {
        return length * width * height;
    }

    void showVolume() {
        System.out.println(getVolume());
    }
}
