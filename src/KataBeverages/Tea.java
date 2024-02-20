import KataBeverages.Beverage;

public class Tea implements Beverage {

    private static final double BASE_PRICE = 1.50;

    public double price() {
        return BASE_PRICE;
    }
}
