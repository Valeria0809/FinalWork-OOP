package logging;

import service.CalculateComplex;

/**
 * Ведение и вывод логов для калькулятора комплексных чисел.
 * Single Responsibility Principle (Принцип единственной ответственности) реализован.
 */
public class LogCalculateComplex implements CalculateComplex {
    private Logon loger;
    private CalculateComplex calculateComplex;

    public LogCalculateComplex(Logon log, CalculateComplex calculateComplex) {
        this.loger = log;
        this.calculateComplex = calculateComplex;
    }

    @Override
    public CalculateComplex sum(Double real, Double imag) {
        if (imag > 0) {
            loger.log("Сложение старого значения " + calculateComplex.toString() + "i"
                    + "с новым " + real + "+" + imag + "i");
        } else {
            loger.log("Сложение старого значения " + calculateComplex.toString() + "i"
                    + "с новым " + real + imag + "i");
        }
        return calculateComplex.sum(real, imag);
    }

    @Override
    public CalculateComplex mult(Double real, Double imaginary) {
        if (imaginary > 0) {
            loger.log("Умножение старого значения " + calculateComplex.toString() + "i"
                    + "на новое " + real + "+" + imaginary + "i");
        } else {
            loger.log("Умножение старого значения " + calculateComplex.toString() + "i"
            + "на новое " + real + imaginary + "i");
        }
        return  calculateComplex.mult(real, imaginary);
    }

    @Override
    public CalculateComplex div(Double real, Double imaginary) {
        if(imaginary > 0){
            loger.log("Деление старого значения " + calculateComplex.toString() + "i"
            + "на новое " + real + "+" + imaginary + "i");
        }else{
            loger.log("Деление старого значения " + calculateComplex.toString() + "i"
            + "на новое " + real + imaginary + "i");
        }
        return calculateComplex.div(real, imaginary);
    }

    @Override
    public String getResult() {
        return calculateComplex.getResult();
    }
}
