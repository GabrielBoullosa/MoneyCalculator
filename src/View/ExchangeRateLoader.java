package View;

import Model.ExchangeRate;
import java.util.List;


public interface ExchangeRateLoader {
    public List<ExchangeRate> loadRates();
}
