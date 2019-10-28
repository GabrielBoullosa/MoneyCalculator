package moneycalculator;

public interface Parser<T> {
    public T parse(String line);
}
