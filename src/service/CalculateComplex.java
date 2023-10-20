package service;

/**
 * Интерфейс с методами для работы с комплексными числами.
 * Interface Segregation Principle (Принцип разделения интерфейса) реализован.
 * Open Closed Principle (Принцип открытости/закрытости) дает возможность добавления нового функционала.
 */
public interface CalculateComplex {
    CalculateComplex sum (Double real, Double imag);
    CalculateComplex mult (Double real, Double imaginary);
    CalculateComplex div (Double real, Double imaginary);
    String getResult();
}
