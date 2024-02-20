import KataBeverages.Beverage;

public class HotChocolate implements Beverage {
    private static final double BASE_PRICE = 1.45;

    @Override
    public double price() {
        return BASE_PRICE;
    }

}
