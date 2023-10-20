package model;

import service.CalculateComplex;

/**
 * Класс ComplexNumbCalculator является моделью калькулятора комплексных чисел.
 * Реализован принцип Single Responsibility Principle (Принцип единственной ответственности),
 * так как в данном классе используется функции калькулятора только для комплексных чисел.
 * Interface Segregation Principle (Принцип разделения интерфейса) обеспечивает использование всех
методов, реализуемых от интерфейса.
 */
public class ComplexNumbCalculator implements CalculateComplex {
    private Double realNumber;
    private Double imagNumber;

    public ComplexNumbCalculator(Double realNumber, Double imagNumber) {
        this.realNumber = realNumber;
        this.imagNumber = imagNumber;
    }

    @Override
    public ComplexNumbCalculator sum(Double real, Double imaginary) {
        realNumber += real;
        imagNumber += imaginary;
        return this;
    }

    @Override
    public ComplexNumbCalculator mult(Double real, Double imaginary) {
        Double resReal = (realNumber * real) - (imagNumber * imaginary);
        Double resImag = (realNumber * imaginary) + (imagNumber * real);
        realNumber = resReal;
        imagNumber = resImag;
        return this;
    }

    @Override
    public ComplexNumbCalculator div(Double real, Double imaginary) {
        Double resReal = (realNumber * real + imagNumber * imaginary) /
                (real * real + imaginary * imaginary);
        Double resImag = (imagNumber * real - realNumber * imaginary) /
                (real * real + imaginary * imaginary);
        realNumber = resReal;
        imagNumber = resImag;
        return this;
    }

    @Override
    public String getResult() {
        if (imagNumber > 0) {
            return realNumber.toString() + "+" + imagNumber.toString();
        } else {
            return realNumber.toString() + imagNumber.toString();
        }
    }

}
