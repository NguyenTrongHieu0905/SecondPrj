package iuh.fit.se;

public class TestRectangle {
    /**
     * Description: Main method to demonstrate the Rectangle class.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        // Create two Rectangle objects
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20.5, 4.0);

        // Print the length of r1 and r2
        System.out.println("Length r1: " + r1.getLength());
        System.out.println("Length r2: " + r2.getLength());

        // Print the area of r2
        System.out.println("Area r2: " + r2.getArea());

        // Set the length of r1 to 10.0
        r1.setLength(10.0);

        // Print the new length of r1
        System.out.println("New length r1: " + r1.getLength());

        // Try to set the width of r2 to a negative value (this will throw an exception)
        try {
            r2.setWidth(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Print the string representation of r1 and r2
        System.out.println(r1);
        System.out.println(r2);
    }
}