package Model;

import Model.Currency;
import java.util.Date;

public class ExchangeRate {
    private Date date ;
    private double rate;
    private Currency from;
    private Currency to;

    public ExchangeRate(Date date, double rate, Currency from, Currency to) {
        this.date = date;
        this.rate = rate;
        this.from = from;
        this.to = to;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public Date getDate() {
        return date;
    }

    public double getRate() {
        return rate;
    }
    
}
