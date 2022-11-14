public class LifelineSite extends Site {
    protected double getBaseAmount(double billableUnitCount, double billingRate) {
        return billableUnitCount * billingRate * 0.5;
    }

    protected double getTaxAmount(double billableUnitCount, double billingRate) {
        return this.getBaseAmount(billableUnitCount, billingRate) * Site.TAX_RATE * 0.2;
    }
}
