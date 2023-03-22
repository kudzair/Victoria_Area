

import java.util.Scanner;

    public class Area{
        public static void main(String[] args) {
            RectangleArea rectangleArea = new RectangleArea();
            rectangleArea.getData();
            rectangleArea.computeField();
            rectangleArea.fieldDisplay();
        }
    }

    class RectangleArea {
        private double len1;
        private double len2;
        private double area;

        public void getData() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter length: ");
            len1 = scanner.nextDouble();
            System.out.println("Please Enter width: ");
            len2 = scanner.nextDouble();
        }

        public void computeField() {
            area = len1 * len2;
        }

        public void fieldDisplay() {
            System.out.println("Length is: " + len1);
            System.out.println("Width is: " + len2);
            System.out.println("Area is: " + area);
        }
}
