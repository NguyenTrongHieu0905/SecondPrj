package iuh.fit.se;

public class Rectangle {
    private double length;
    private double width;

    /**
     * Description: Constructor for the Rectangle class with default length and width of 1.0.
     */
    public Rectangle() {
        this(1.0, 1.0);
    }

    /**
     * Description: Constructor for the Rectangle class with specified length and width.
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     * @throws IllegalArgumentException if length or width is less than 0.
     */
    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    /**
     * Description: Get the length of the rectangle.
     * @return The length of the rectangle.
     */
    public double getLength() {
        return length;
    }

    /**
     * Description: Set the length of the rectangle.
     * @param length The new length of the rectangle.
     * @throws IllegalArgumentException if length is less than 0.
     */
    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    /**
     * Description: Get the width of the rectangle.
     * @return The width of the rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Description: Set the width of the rectangle.
     * @param width The new width of the rectangle.
     * @throws IllegalArgumentException if width is less than 0.
     */
    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    /**
     * Description: Calculate the area of the rectangle.
     * @return The area of the rectangle.
     */
    public double getArea() {
        return this.length * this.width;
    }

    /**
     * Description: Calculate the perimeter of the rectangle.
     * @return The perimeter of the rectangle.
     */
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    /**
     * Description: Return a string representation of the rectangle.
     * @return A string representation of the rectangle in the format "Rectangle[length=..., width=...]".
     */
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}