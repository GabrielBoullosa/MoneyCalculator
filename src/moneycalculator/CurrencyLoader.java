package moneycalculator;

import Model.Currency;
import java.util.ArrayList;
import java.util.List;

public interface CurrencyLoader {
    
    public List<Currency> loadCurrencies(String csvFile);
}
