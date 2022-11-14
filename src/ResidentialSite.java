public class ResidentialSite extends Site {
    protected double getBaseAmount(double billableUnitCount, double billingRate) {
        return billableUnitCount * billingRate;
    }

    protected double getTaxAmount(double billableUnitcount, double billingRate) {
        return this.getBaseAmount(billableUnitcount, billingRate) * Site.TAX_RATE;
    }
}
