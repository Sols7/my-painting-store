package ru.itsjava.services;

import ru.itsjava.domain.Painting;
import ru.itsjava.domain.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService {

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше ФИО:");
        String clientName = scanner.next();

        Client client = new Client(clientName, new ArrayList<>());

        List<Painting> paintingList = new ArrayList<>();
        paintingList.add(new Painting("Мона_Лиза", "Леонардо_да_Винчи"));
        paintingList.add(new Painting("Ночной_дозор", "Рембрандт"));

        PaintingService paintingService = new PaintingServiceImpl(paintingList);

        ClientService clientService = new ClientServiceImpl(client, scanner, paintingService);

        MenuService menuService = new MenuServiceImpl(clientService, scanner);
        menuService.menu();

    }
}
