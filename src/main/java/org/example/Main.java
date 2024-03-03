package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Массив фирм часов
        String[] Brand = {"Dior", "Doxa", "Denissov","Alexander Shorokhoff", "Grant"};

        // Двумерный массив, связывающий список фирм с названием марки
        String[][] BrandName = {{Brand[0], "Christian Dior"},
                {Brand[1], "Doxa S.A."},
                {Brand[2], "DENISSOV WATCH COMPANY"},
                {Brand[3], "ALEXANDER SHOROKHOFF"},
                {Brand[4], "GRANT"}};

        // Массив с покупателями
        ArrayList<String[]> clients = new ArrayList<>();

        // Ввод данных о покупателях и заказах
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите данные о покупателе " + (i + 1) + ":");

            // Запрос ФИО
            System.out.print("ФИО: ");
            String fullName = sc.nextLine();

            // Запрос почты
            System.out.print("Email: ");
            String email = sc.nextLine();

            // Запрос номера телефона
            System.out.print("Номер телефона: ");
            String phoneNumber = sc.nextLine();

            // Вывод списка позиций товара
            System.out.println("Позиции товара:");
            for (int j = 0; j < BrandName.length; j++)
            {
                System.out.println((j + 1) + ". " + BrandName[j][1] + " - " + BrandName[j][0]);
            }

            // Запрашиваем у пользователя ввод позиции, преобразуем его в целое число
            // и используем для доступа к массиву BrandName
            System.out.print("Введите позицию товара: ");
            int positionIndex = Integer.parseInt(sc.nextLine()) - 1;
            String[] chosenPosition = BrandName[positionIndex];

            // Запрос количества товара
            System.out.print("Введите количество: ");
            int amount = Integer.parseInt(sc.nextLine());

            // Добавление нового элемента в ArrayList с клиентами
            clients.add(new String[]{fullName, email, phoneNumber,
                    chosenPosition[0] + " - " + chosenPosition[1], String.valueOf(amount)});

        }

        // Вывод информации о заказах
        System.out.println("\nЗаказы:");
        for (String[] client : clients) {
            System.out.println("Покупатель: " + client[0]);
            System.out.println("Email: " + client[1]);
            System.out.println("Номер телефона: " + client[2]);
            System.out.println("Товар: " + client[3]);
            System.out.println("Количество: " + client[4]);
            System.out.println();
        }
    }
}