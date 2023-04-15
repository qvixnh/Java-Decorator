# Java-Decorator
public abstract class Car {
   private String brand;
   private String series;
   private int yearCreated;
   private String color;
   private int seatNumber;
   private double price;
   private String guaranteeYear;
   private String xilander;
   public abstract double cost();
   // Constructor
   public Car(String brand, String series, int yearCreated, String color, int seatNumber, double price, String guaranteeYear, String xilander) {
       this.brand = brand;
       this.series = series;
       this.yearCreated = yearCreated;
       this.color = color;
       this.seatNumber = seatNumber;
       this.price = price;
       this.guaranteeYear = guaranteeYear;
       this.xilander = xilander;
   }


   // Getters and setters
   public String getBrand() {
       return brand;
   }


   public void setBrand(String brand) {
       this.brand = brand;
   }


   public String getSeries() {
       return series;
   }


   public void setSeries(String series) {
       this.series = series;
   }


   public int getYearCreated() {
       return yearCreated;
   }


   public void setYearCreated(int yearCreated) {
       this.yearCreated = yearCreated;
   }


   public String getColor() {
       return color;
   }


   public void setColor(String color) {
       this.color = color;
   }


   public int getSeatNumber() {
       return seatNumber;
   }


   public void setSeatNumber(int seatNumber) {
       this.seatNumber = seatNumber;
   }


   public double getPrice() {
       return price;
   }


   public void setPrice(double price) {
       this.price = price;
   }


   public String getGuaranteeYear() {
       return guaranteeYear;
   }


   public void setGuaranteeYear(String guaranteeYear) {
       this.guaranteeYear = guaranteeYear;
   }


   public String getXilander() {
       return xilander;
   }


   public void setXilander(String xilander) {
       this.xilander = xilander;
   }
}


public class BasicCar extends Car{
   public BasicCar(String brand, String series, int yearCreated, String color, int seatNumber, double price, String guaranteeYear, String xilander) {
       super(brand, series, yearCreated, color, seatNumber, price, guaranteeYear, xilander);
   }


   @Override
   public double cost() {
       return 5000;
   }
}
public class LuxuryCar extends Car{
   @Override
   public double cost() {
       return 1000000;
   }


   public LuxuryCar(String brand, String series, int yearCreated, String color, int seatNumber, double price, String guaranteeYear, String xilander) {
       super(brand, series, yearCreated, color, seatNumber, price, guaranteeYear, xilander);
   }
}
public class CarDecorator extends Car{
   protected Car wrapObj;
   protected String description;
   protected String manufacturer;
   protected String type;
   protected double equipmentPrice;
   protected int warrantyPeriod;


   public CarDecorator(String brand, String series, int yearCreated, String color, int seatNumber, double price, String guaranteeYear, String xilander) {
       super(brand, series, yearCreated, color, seatNumber, price, guaranteeYear, xilander);
   }


   @Override
   public double cost() {
       return 1;
   }
}



public class GPS extends CarDecorator{
   public GPS(String brand, String series, int yearCreated, String color, int seatNumber, double price, String guaranteeYear, String xilander) {
       super(brand, series, yearCreated, color, seatNumber, price, guaranteeYear, xilander);
   }


   @Override
   public double cost() {
       return super.cost();
   }
}
public class Key extends CarDecorator{
   public Key(String brand, String series, int yearCreated, String color, int seatNumber, double price, String guaranteeYear, String xilander) {
       super(brand, series, yearCreated, color, seatNumber, price, guaranteeYear, xilander);
   }
   @Override
   public double cost(){
       return super.cost();
   }
}
public class Sensor extends CarDecorator{
   public Sensor(String brand, String series, int yearCreated, String color, int seatNumber, double price, String guaranteeYear, String xilander) {
       super(brand, series, yearCreated, color, seatNumber, price, guaranteeYear, xilander);
   }


   @Override
   public double cost() {
       return super.cost();
   }
}
public class Key extends CarDecorator{
   public Key(String brand, String series, int yearCreated, String color, int seatNumber, double price, String guaranteeYear, String xilander) {
       super(brand, series, yearCreated, color, seatNumber, price, guaranteeYear, xilander);
   }
   @Override
   public double cost(){
       return super.cost();
   }
}

