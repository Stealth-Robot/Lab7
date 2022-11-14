public class ResidentialSite extends Site {
    protected double getBaseAmount(double billableUnitCount, double billingRate) {
        return billableUnitCount * billingRate;
    }

    protected double getTaxAmount(double billableUnitCount, double billingRate) {
        return this.getBaseAmount(billableUnitCount, billingRate) * Site.TAX_RATE;
    }
}
