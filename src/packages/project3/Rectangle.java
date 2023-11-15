package packages.project3;

/**
 * Rectangle
 */
public class Rectangle {

    public double width;
    public double height;

    // functions 
    public double Area() {
        return this.width * this.height;
    }

    public double Perimeter() {
        return 2 * (this.width + this.height);
    }

    public double Diagonal() {
        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
    }


}