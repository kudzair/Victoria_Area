public class Car {

    public class Main {
        private String model;
        private String brand;
        private int year;
        private double price;
        private String color;
        private int quantity;

        public Car(String model, String brand, int year, double price, String color, int quantity) {
            this.model = model;
            this.brand = brand;
            this.year = year;
            this.price = price;
            this.color = color;
            this.quantity = quantity;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void deliver(int deliveredQuantity) {
            this.quantity += deliveredQuantity;
        }

        public void sell(int soldQuantity) {
            this.quantity -= soldQuantity;
        }

        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", brand='" + brand + '\'' +
                    ", year=" + year +
                    ", price=" + price +
                    ", color='" + color + '\'' +
                    ", quantity=" + quantity +
                    '}';
        }
    }

}
public class Main {
    public static void main(String[] args) {
        // Create a new car object with initial values
        Car car = new Car("Civic", "Honda", 2022, 25000.0, "Red", 10);

        // Print the car object using the toString() method
        System.out.println(car.toString());

        // Deliver 5 more cars
        car.deliver(5);

        // Sell 2 cars
        car.sell(2);

        // Print the car object again to see the changes
        System.out.println(car.toString());

        // Change the color of the car to "Blue"
        car.setColor("Blue");

        // Print the car object again to see the changes
        System.out.println(car.toString());
    }
}
