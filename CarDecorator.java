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
