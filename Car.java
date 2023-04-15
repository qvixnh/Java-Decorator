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
