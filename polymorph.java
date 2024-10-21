public class polymorph {
    abstract class Shape {
        abstract void numberOfSides();
    }
    class Rectangle extends Shape {
        @Override
        void numberOfSides() {
            System.out.println("Rectangle has 4 sides");
        }
    }
    class Triangle extends Shape {
        @Override
        void numberOfSides() {
            System.out.println("Triangle has 3 sides");
        }
    }
    class Hexagon extends Shape {
        @Override
        void numberOfSides() {
            System.out.println("Hexagon has 6 sides");
        }
    }
    public static void main(String[] args) {
        polymorph ab = new polymorph();
        Rectangle rec = ab.new Rectangle();
        Triangle tri = ab.new Triangle();
        Hexagon hex = ab.new Hexagon();
        rec.numberOfSides();
        tri.numberOfSides();
        hex.numberOfSides();
    }
}


