package View;

import Model.Currency;
import Model.ExchangeRate;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CSVCurExRLoader implements CurrencyLoader, ExchangeRateLoader{

    private List<Currency> currencies= new ArrayList<>();
    List<ExchangeRate> rates= new ArrayList<>();
        
    @Override
    public List<Currency> loadCurrencies() {
        List<Currency> curren= new ArrayList<>();
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\gabriel_hijo\\Documents\\NetBeansProjects\\MoneyCalculator\\src\\currencies.txt"));
            while ((line = br.readLine()) != null) {                
                String[] datos = line.split(cvsSplitBy);
                curren.add(new Currency(datos[0], datos[1], datos[2]));
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
        currencies = curren;
        return curren;
    }

    @Override
    public List<ExchangeRate> loadRates() {
        List<ExchangeRate> rs= new ArrayList<>();
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\gabriel_hijo\\Documents\\NetBeansProjects\\MoneyCalculator\\src\\excrate.txt"));
            while ((line = br.readLine()) != null) {                
                String[] datos = line.split(cvsSplitBy);
                for (Currency c : currencies) {
                    if(datos[0].equals(c.getName()))
                        rs.add(new ExchangeRate(new Date(), Double.parseDouble(datos[1]), currencies.get(0), c));
                }
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
        rates = rs;
        return rs;
    }
    
}
