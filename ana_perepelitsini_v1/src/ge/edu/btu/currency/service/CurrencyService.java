package ge.edu.btu.currency.service;

public interface CurrencyService {
    public int convert(int amount);
    public double convert(double amount);
    public int setExchangeRate(int value);
    public double setExchangeRate(double value);
}