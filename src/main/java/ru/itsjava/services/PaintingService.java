package ru.itsjava.services;

import ru.itsjava.domain.Painting;

public interface PaintingService {
    Painting takePaintingByName(String name);

    void putPainting(Painting painting);

    boolean hasPainting(String name);

    void printPaintings();
}
