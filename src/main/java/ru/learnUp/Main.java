package ru.learnUp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.learnUp.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        Calculator calculator = context.getBean(Calculator.class);

        long arg1,arg2;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введиет значение 1");
        arg1 = scaner.nextLong();
        System.out.println("Введиет значение 2");
        arg2 = scaner.nextLong();


        System.out.println(calculator.sub(arg1, arg2));
        System.out.println(calculator.sum(arg1, arg2));
        System.out.println(calculator.mult(arg1, arg2));
        System.out.println(calculator.div(arg1, arg2));
    }
}
