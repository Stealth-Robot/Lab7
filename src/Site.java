abstract class Site {
    protected static final double TAX_RATE = 0.13;

    public double getBillableAmount(double billableUnitCount, double billingRate) {
        return getBaseAmount(billableUnitCount, billingRate) + getTaxAmount(billableUnitCount, billingRate);
    }

    protected abstract double getTaxAmount(double billableUnitCount, double billingRate);
    protected abstract double getBaseAmount(double billableUnitCount, double billingRate);

    public static void main(String[] args) {
        double billingRate = 1527.25;
        double billableUnitCount = 271;

        ResidentialSite residentialSite = new ResidentialSite();
        System.out.println("Residential: " + residentialSite.getBillableAmount(billableUnitCount, billingRate));

        LifelineSite lifelineSite = new LifelineSite();
        System.out.println("Lifeline: " + lifelineSite.getBillableAmount(billableUnitCount, billingRate));
    }
}
