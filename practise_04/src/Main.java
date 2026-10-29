import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите side1: ");
        double side1 = input.nextDouble();

        System.out.print("Введите side2: ");
        double side2 = input.nextDouble();

        System.out.print("Введите side3: ");
        double side3 = input.nextDouble();

        System.out.print("Введите цвет: ");
        String color = input.next();

        System.out.print("Закрашен? true/false: ");
        boolean filled = input.nextBoolean();

        try {
            Triangle triangle = new Triangle(side1, side2, side3);

            triangle.setColor(color);
            triangle.setFilled(filled);

            System.out.println(triangle);
            System.out.println("Площадь: " + triangle.getArea());
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println("Цвет: " + triangle.getColor());
            System.out.println("Закрашен: " + triangle.isFilled());

        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(10);

        if (c1.compareTo(c2) >= 0) {
            System.out.println("Первый ComparableCircle больше");
        } else {
            System.out.println("Второй ComparableCircle больше");
        }

        Rectangle r = new Rectangle(20, 20);

        if (c2.compareTo(r) >= 0) {
            System.out.println("Круг больше прямоугольника");
        } else {
            System.out.println("Прямоугольник больше круга");
        }

        GeometricObject biggerCircle = GeometricObject.max(c1, c2);

        System.out.println("Площадь первого круга: " + c1.getArea());
        System.out.println("Площадь второго круга: " + c2.getArea());
        System.out.println("Большая площадь: " + biggerCircle.getArea());

        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(8, 9);

        GeometricObject biggerRectangle =
                GeometricObject.max(rectangle1, rectangle2);

        System.out.println("Площадь первого прямоугольника: " + rectangle1.getArea());
        System.out.println("Площадь второго прямоугольника: " + rectangle2.getArea());
        System.out.println("Большая площадь прямоугольника: " + biggerRectangle.getArea());

        GeometricObject[] objects = {
                new Square(5),
                new Circle(3),
                new Rectangle(4, 6),
                new Square(10),
                new Circle(7)
        };

        for (GeometricObject object : objects) {

            System.out.println("Площадь: " + object.getArea());

            if (object instanceof Colorable) {
                Colorable colorable = (Colorable) object;
                colorable.howToColor();
            }
        }
    }
}
