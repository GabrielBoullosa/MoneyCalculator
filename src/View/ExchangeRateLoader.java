package View;

import Model.ExchangeRate;
import java.util.List;

public interface ExchangeRateLoader {
    List<ExchangeRate> loadRates();
}
