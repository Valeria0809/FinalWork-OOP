package view;

import service.CalculateComplex;
import service.ICalculateFactoryComplex;

import java.util.Scanner;

/**
 * Вью-функция для работы с комплексными числами. Реализация действия +, *, /.
 */

public class ViewComplexCalculator {
    private ICalculateFactoryComplex calculateFactoryComplex;
    String realNum = "Введите вещественную часть второго комплексного числа: ";
    String imagNum = "Введите мнимую часть второго комплексного числа: ";

    public ViewComplexCalculator(ICalculateFactoryComplex calculateFactoryComplex) {
        this.calculateFactoryComplex = calculateFactoryComplex;
    }

    public void run() {
        Double primaryReal = promptDouble("Введите вещественную часть комплексного числа:  ");
        Double primaryImaginary = promptDouble("Введите мнимую часть комплексного числа: ");
        CalculateComplex calculator = calculateFactoryComplex.creat(primaryReal, primaryImaginary);
        while (true) {
            String cmd = prompt("Выберите команду (+, *, /, =): ");
            if (cmd.equals("+")) {
                Double real = promptDouble(realNum);
                Double imag = promptDouble(imagNum);
                calculator.sum(real, imag);
                continue;
            }
            if (cmd.equals("*")) {
                Double real = promptDouble(realNum);
                Double imag = promptDouble(imagNum);
                calculator.mult(real, imag);
                continue;
            }
            if (cmd.equals("/")) {
                Double real = promptDouble(realNum);
                Double imag = promptDouble(imagNum);
                calculator.div(real, imag);
                continue;
            }
            if (cmd.equals("=")) {
                String result = calculator.getResult();
                System.out.println("Результат " + result + "\n");
                break;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}


