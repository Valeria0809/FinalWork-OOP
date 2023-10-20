package service;

import model.ComplexNumbCalculator;

public class CalculateFactoryComplex implements ICalculateFactoryComplex {
    @Override
    public CalculateComplex creat(Double real, Double imag) {
        return new ComplexNumbCalculator(real,imag);
    }
}
