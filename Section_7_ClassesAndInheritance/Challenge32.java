/*
 Wall Area Computation
Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.



The class needs to have two constructors:

The first constructor does not have any parameters (no-args constructor).

The second constructor has parameters width and height of type double and it needs to initialize the fields.

In case the width parameter is less than 0 it needs to set the width field value to 0.

In case the height parameter is less than 0 it needs to set the height field value to 0.



Write the following methods (instance methods):

Method named getWidth without any parameters, it needs to return the value of width field.

Method named getHeight without any parameters, it needs to return the value of height field.

Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.

Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.

Method named getArea without any parameters, it needs to return the area of the wall.


*/


package Section_7_ClassesAndInheritance;

public class Challenge32 {
    public class Wall {
    // write code here
    private double width;
    private double height;
    
    public Wall(){
        
    }
    
    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
        this.width = width;
        }
    }
    
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
        this.height = height;
        }
    }
    
    public double getArea() {
        return this.height * this.width;
    }
}
}
