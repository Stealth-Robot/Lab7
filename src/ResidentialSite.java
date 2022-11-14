public class ResidentialSite extends Site {
    public double getBillableAmount(double _units, double _rate) {
        return getBaseAmount(_units, _rate) + getTaxAmount(_units, _rate);
    }

    private double getBaseAmount(double _units, double _rate) {
        return _units * _rate;
    }

    private double getTaxAmount(double _units, double _rate) {
        return this.getBaseAmount(_units, _rate) * Site.TAX_RATE;
    }
}
