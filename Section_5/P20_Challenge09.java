/*
Constructing A Comprehensive Area Calculator For Circles And Rectangles In Java
Write a method named area with one double parameter named radius.

The method needs to return a double value that represents the area of a circle.

If the parameter radius is negative then return -1.0 to represent an invalid value.

Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.

The method needs to return an area of a rectangle.

If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
*/

package Section_5;

public class P20_Challenge09 {
    public class AreaCalculator {
    // write code here
    public static double area (double radius) {
        
        double areaOfCircle = Math.PI * (radius) * (radius);
        
        if (radius < 0) {
            return -1.0;
        } 
        
        return areaOfCircle;
    }
    
    public static double area (double length, double width) {
        double areaOfRectangle = length * width;
        
        if (length < 0 || width < 0){
            return -1.0;
        } 
        return areaOfRectangle;
    }
}
}
