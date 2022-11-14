abstract class Site {
    protected static final double TAX_RATE = 0.13;

    public double getBillableAmount(double billibleUnitCount, double _rate) {
        return getBaseAmount(billibleUnitCount, _rate) + getTaxAmount(billibleUnitCount, _rate);
    }

    protected abstract double getTaxAmount(double units, double rate);
    protected abstract double getBaseAmount(double units, double rate);

    public static void main(String[] args) {
        double _rate = 1527.25;
        double _units = 271;

        ResidentialSite residentialSite = new ResidentialSite();
        System.out.println("Residential: " + residentialSite.getBillableAmount(_units, _rate));

        LifelineSite lifelineSite = new LifelineSite();
        System.out.println("Lifeline: " + lifelineSite.getBillableAmount(_units, _rate));
    }
}
