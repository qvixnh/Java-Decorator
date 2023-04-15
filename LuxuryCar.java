public class LuxuryCar extends Car{
    @Override
    public double cost() {
        return 1000000;
    }

    public LuxuryCar(String brand, String series, int yearCreated, String color, int seatNumber, double price, String guaranteeYear, String xilander) {
        super(brand, series, yearCreated, color, seatNumber, price, guaranteeYear, xilander);
    }
}
