package Type_conversion;

public class Currency {

    double rupeeToDollar = 0.012;
    double dollarToRupee = 75.00;
    double rupeeToEuro = 0.011;

    public double Rupee(double rupees)
    {
        return rupees * rupeeToDollar;
    }
    public double RupeeToEuro(double rupees)
    {
        return rupees * rupeeToEuro;
    }

    public double DollarToRupee(double dollars)
    {
        return dollars * dollarToRupee;
    }

}
