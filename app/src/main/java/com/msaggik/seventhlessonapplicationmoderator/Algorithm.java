package com.msaggik.seventhlessonapplicationmoderator;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Algorithm {

    // создание пустого конструктора
    public Algorithm() {
    }

    // метод рандомно генерирующий вопрос для модерации общения
    public String moderator() {

        // задание поля для метода
        String[] listQuestions = new String[100]; // текстовый массив из 100 ячеек
        int count = 0; // счётчик

        // сканер какой-либо информации
        Scanner scanner = new Scanner(questions); // чтение большой строки
        while (scanner.hasNext()) { // цикл (продолжается до тех пор пока в считываемом тексте за каждым абзацем есть строки)
            String input = scanner.nextLine(); // чтение строки
            listQuestions[count] = input; // запись считываемой строки в одну ячейку массива
            count++; // повышение счётчика на единицу
        }

        scanner.close(); // закрытие сканера

        /** Для генерации случайных чисел используется класс Random
         * Если нужно сгенерировать случайное число от 0 до N, то нужно воспользоваться методом nextInt(int N)
         */

        Random random = new Random(); // создание объекта класса Random
        int key = random.nextInt(count); // генерация случайного числа от 0 до величины счётчика count

        return listQuestions[key]; // возврат случайной строки из массива вопросов
    }

    private String questions = "Какой цвет тебе больше нравится?\n" +
            "Какая марка машины твоя любимая?\n" +
            "Какое твоё самое большое достижение?\n" +
            "Расскажи, есть ли у тебя домашний питомец?\n" +
            "Какое твоё самое любимое блюдо?\n" +
            "В каком самом красивом месте ты бывал(а)?\n" +
            "Кем ты себя видишь через 10 лет?\n";
}
