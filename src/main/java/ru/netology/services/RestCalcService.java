package ru.netology.services;

public class RestCalcService {
    public int calculate(int income, int expense, int threshold) {

        int count = 0; // счетчик месяцев отдыха
        int balance = 0; // денег на начало месяца
        for (
                int month = 0;
                month < 12; month++) {
            if (balance >= threshold) {
                count++;
                balance = (balance - expense) / 3;
            } else {
                balance = balance + income - expense;
            }
        }
        return count;
    }
}