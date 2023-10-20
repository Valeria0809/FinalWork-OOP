package logging;

import model.ComplexNumbCalculator;
import service.CalculateComplex;
import service.ICalculateFactoryComplex;

public class LogCalculateFactoryComplex implements ICalculateFactoryComplex {
    private Logon logger;

    public LogCalculateFactoryComplex(Logon logger) {
        this.logger = logger;
    }

    @Override
    public CalculateComplex creat(Double real, Double imag) {
        return new LogCalculateComplex(logger, new ComplexNumbCalculator(real, imag));
    }
}
