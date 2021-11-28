package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Painting;
import ru.itsjava.domain.Client;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{
    private final Client client;
    private final Scanner scanner;
    private final PaintingService paintingService;


    @Override
    public void buyPainting() {
        System.out.println("Введите название картины");
        String title = scanner.next();
        if (paintingService.hasPainting(title)){
            System.out.println("Покупаем картину ...");
            paintingService.takePaintingByName(title);
            System.out.println("Купили картину " + title);
        } else {
            System.out.println("Не смогли купить картину. Такой картины нет :(");
        }
    }

    @Override
    public void putPainting() {
        System.out.println("Введите название картины");
        String title = scanner.next();

        System.out.println("Введите художника");
        String creator = scanner.next();

        Painting painting = new Painting(title, creator);
        paintingService.putPainting(painting);
    }

    @Override
    public void printPaintings() {
        System.out.println("Уважаемый " + client.getName());
        System.out.println("Вот наши картины: ");
        paintingService.printPaintings();
    }
}
