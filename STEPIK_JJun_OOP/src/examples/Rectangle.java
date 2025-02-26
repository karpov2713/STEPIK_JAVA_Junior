package examples;

public class Rectangle {
    double length;
    double width;

    void setDimens(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double rectArea() {
        return this.length * this.width;
    }
}
