public class LifelineSite extends Site {
    protected double getBaseAmount(double billableUnitCount, double _rate) {
        return billableUnitCount * _rate * 0.5;
    }

    protected double getTaxAmount(double billableUnitCount, double _rate) {
        return this.getBaseAmount(billableUnitCount, _rate) * Site.TAX_RATE * 0.2;
    }
}
