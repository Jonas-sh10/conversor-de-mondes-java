public class Monedas {
    private double USD;
    private double ARS;
    private double BRL;
    private double COP;
    private double MXN;
    private double PEN;

    public Monedas(MonedasApi tipoMonedasApi){
        this.USD = Double.valueOf(tipoMonedasApi.USD());
        this.ARS = Double.valueOf(tipoMonedasApi.ARS());
        this.BRL = Double.valueOf(tipoMonedasApi.BRL());
        this.COP = Double.valueOf(tipoMonedasApi.COP());
        this.MXN = Double.valueOf(tipoMonedasApi.MXN());
        this.PEN = Double.valueOf(tipoMonedasApi.PEN());
    }

    public double getUSD() {
        return USD;
    }

    public double getARS() {
        return ARS;
    }

    public double getBRL() {
        return BRL;
    }

    public double getCOP() {
        return COP;
    }

    public double getMXN() {
        return MXN;
    }

    public double getPEN() {
        return PEN;
    }

    @Override
    public String toString() {
        return "Monedas{" +
                "USD=" + USD +
                ", ARS=" + ARS +
                ", BRL=" + BRL +
                ", COP=" + COP +
                ", MXN=" + MXN +
                ", PEN=" + PEN +
                '}';
    }
}
