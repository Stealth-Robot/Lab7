public class LifelineSite extends Site {
    protected double getBaseAmount(double _units, double _rate) {
        return _units * _rate * 0.5;
    }

    protected double getTaxAmount(double _units, double _rate) {
        return this.getBaseAmount(_units, _rate) * Site.TAX_RATE * 0.2;
    }
}
