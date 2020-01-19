package moneycalculator;

import Model.Currency;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVCurrencyLoader implements CurrencyLoader{

    public List<Currency> loadCurrencies(String csvFile) {
        List<Currency> currencies= new ArrayList<>();      
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {                
                String[] datos = line.split(cvsSplitBy);
                currencies.add(new Currency(datos[1], datos[2], datos[3]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return currencies;
    }
}
