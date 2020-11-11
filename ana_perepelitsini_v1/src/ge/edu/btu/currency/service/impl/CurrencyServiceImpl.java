package ge.edu.btu.currency.service.impl;

import ge.edu.btu.currency.service.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {
    CurrencyService currencyService = new CurrencyServiceImpl();
    @Override
    public int convert(int amount) {
        int value = setExchangeRate(3);
        return amount/value;
    }

    @Override
    public double convert(double amount) {
        double value = setExchangeRate(3.1);
        return amount/value;
    }

    @Override
    public int setExchangeRate(int value) {
        return value;
    }

    @Override
    public double setExchangeRate(double value) {
        return value;
    }
}