package red;

public class Cylinder {
    public Cylinder() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public static double getVolume(int radius, int height){
        double baseArea  = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI  * radius;
        double volume    = perimeter * height + 2 * baseArea;
        return volume;
    }
}
