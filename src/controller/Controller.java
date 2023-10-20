package controller;

import service.CalculateFactoryComplex;
import service.ICalculateFactoryComplex;
import view.ViewComplexCalculator;

import java.util.Scanner;

public class Controller {
    private ICalculateFactoryComplex calculateFactoryComplex;

    public Controller() {
        ICalculateFactoryComplex calculateFactoryComplex = new CalculateFactoryComplex();
    }

    public void start() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ввод частей первого комплексного числа: " +
                    "\n 1 - вещественная часть " + "\n 2 - мнимая часть");
            String startChoice = scanner.nextLine();
            if (startChoice.equals("1")) {
                try {
                    ViewComplexCalculator view = new ViewComplexCalculator(calculateFactoryComplex);
                    view.run();
                } catch (Exception E){
                    System.out.println("Ошибка входных данных!");
                }

            }
            if(startChoice.equals("2")){
                try{
                    ViewComplexCalculator view = new ViewComplexCalculator(calculateFactoryComplex);
                    view.run();
                } catch (Exception E){
                    System.out.println("Ошибка входных данных!");
                }
            }
            System.out.println("Ввести новые значения ? [Y/N]");
            startChoice = scanner.nextLine();
            if(startChoice.equals("Y")){
                continue;
            }
            break;
        }
    }
}
