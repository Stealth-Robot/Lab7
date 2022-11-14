abstract class Site {
    protected static final double TAX_RATE = 0.13;

    public double getBillableAmount(double _units, double billingRate) {
        return getBaseAmount(_units, billingRate) + getTaxAmount(_units, billingRate);
    }

    protected abstract double getTaxAmount(double units, double billingRate);
    protected abstract double getBaseAmount(double units, double billingRate);

    public static void main(String[] args) {
        double billingRate = 1527.25;
        double _units = 271;

        ResidentialSite residentialSite = new ResidentialSite();
        System.out.println("Residential: " + residentialSite.getBillableAmount(_units, billingRate));

        LifelineSite lifelineSite = new LifelineSite();
        System.out.println("Lifeline: " + lifelineSite.getBillableAmount(_units, billingRate));
    }
}
