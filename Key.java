public class Key extends CarDecorator{
    public Key(String brand, String series, int yearCreated, String color, int seatNumber, double price, String guaranteeYear, String xilander) {
        super(brand, series, yearCreated, color, seatNumber, price, guaranteeYear, xilander);
    }
    @Override
    public double cost(){
        return super.cost();
    }
}
