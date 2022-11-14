public class LifelineSite extends Site {
    public double getBillableAmount(double _units, double _rate) {
        double base = getBaseAmount(_units, _rate);
        double tax = getTaxAmount(_units, _rate);
        return base + tax;
    }

    private double getBaseAmount(double _units, double _rate) {
        return _units * _rate * 0.5;
    }

    private double getTaxAmount(double _units, double _rate) {
        return this.getBaseAmount(_units, _rate) * Site.TAX_RATE * 0.2;
    }
}
