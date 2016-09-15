package q12;

public class Commission extends Hourly {

    double totalSales;
    double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String esocialSecurityNumber, double erate,
            double ecommRate) {
        super(eName, eAddress, ePhone, esocialSecurityNumber, erate);
        commissionRate = ecommRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;

    }

    public double pay() {
        double payment = super.pay();
        payment += totalSales * commissionRate;
        totalSales = 0;
        return payment;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String result = super.toString();
        result += "\tTotal Sales is: " + totalSales;
        return result;
    }

}
