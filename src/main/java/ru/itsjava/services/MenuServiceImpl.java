package ru.itsjava.services;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final ClientService clientService;
    private final Scanner scanner;

    @Override
    public void menu() {

        while (true) {
            printMenu();
            System.out.println("Введите номер меню");
            int numMenu = scanner.nextInt();
            if (numMenu == 1) {
                System.out.println("Вы выбрали купить картину");
                clientService.buyPainting();
            } else if (numMenu == 2) {
                System.out.println("Вы выбрали положить картину");
                clientService.putPainting();
            } else if (numMenu == 3) {
                System.out.println("Печатаем название картин");
                clientService.printPaintings();
            } else {
                System.out.println("До встречи в нашем магазине");
                break;
            }
        }

    }

    @Override
    public void printMenu() {
        System.out.println("1 - Купить; 2 - Отдать; 3 - Напечатать; Все остальное -  выход");
    }
}
