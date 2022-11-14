public class ResidentialSite extends Site {
    protected double getBaseAmount(double _units, double _rate) {
        return _units * _rate;
    }

    protected double getTaxAmount(double _units, double _rate) {
        return this.getBaseAmount(_units, _rate) * Site.TAX_RATE;
    }
}
