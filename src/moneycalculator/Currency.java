package moneycalculator;

public class Currency {
    private String code;
    private String name;
    private String symbol;
    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Currency{" + "code=" + code + ", name=" + name + ", symbol=" + symbol + '}';
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public Currency(String code, String name, String symbol) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }
    
    
}
