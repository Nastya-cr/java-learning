public class ComparableCircle extends Circle implements Comparable<GeometricObject> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(GeometricObject other) {
        if (this.getArea() > other.getArea()) {
            return 1;
        } else if (this.getArea() < other.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}