public class LifelineSite extends Site {
    public double getBillableAmount(double _units, double _rate) {
        double base = getBaseAmount(_units, _rate);
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }

    private double getBaseAmount(double _units, double _rate) {
        return _units * _rate * 0.5;
    }
}
