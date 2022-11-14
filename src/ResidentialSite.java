public class ResidentialSite extends Site {
    protected double getBaseAmount(double billableUnitCount, double _rate) {
        return billableUnitCount * _rate;
    }

    protected double getTaxAmount(double billableUnitcount, double _rate) {
        return this.getBaseAmount(billableUnitcount, _rate) * Site.TAX_RATE;
    }
}
