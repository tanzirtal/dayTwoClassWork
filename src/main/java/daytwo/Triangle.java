package daytwo;

public class Triangle extends Shape{
    public double height;
    //Constructor
    public Triangle(String someColor, double side, double height) {
        super(someColor);
        this.side = side; //technically base, but we'll call it side
        this.height = height;
    }

    @Override //Annotation
    public double calculateArea () {
        return 0.5*(this.side * this.height);
    }


}