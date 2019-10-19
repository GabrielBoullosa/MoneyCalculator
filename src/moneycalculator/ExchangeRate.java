package moneycalculator;

import java.util.Date;

public class ExchangeRate {
    private Date date ;
    private double rate;

    public ExchangeRate(Date date, double rate) {
        this.date = date;
        this.rate = rate;
    }

    public Date getDate() {
        return date;
    }

    public double getRate() {
        return rate;
    }
    
}
