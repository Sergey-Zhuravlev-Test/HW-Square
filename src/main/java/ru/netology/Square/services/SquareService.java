package ru.netology.Square.services;

public class SquareService {

    public int calcSquareInLimit(int x, int y) {
        int num = 0;

        for (int i = 10; i <= 99; i++) {

            int result = i * i;
            if (result >= x && result <= y) {
                num = num + 1;
            }
        }
        return num;
    }
}


