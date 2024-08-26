package Taller2SRP.model;


import Taller2SRP.model.valueObjects.DateValue;

public class Factura {
    private final DateValue date;
    private final int total;
    private final double percentageIVA;

    public Factura(DateValue date, int total, double percentageIVA) {
        this.date = date;
        this.total = total;
        this.percentageIVA = percentageIVA;
    }

    public DateValue getDate() {
        return date;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "date='" + date.getValue() + '\'' +
                ", total=" + total +
                ", percentageIVA=" + percentageIVA +
                '}';
    }
}
