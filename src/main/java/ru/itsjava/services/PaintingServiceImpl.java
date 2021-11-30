package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Painting;

import java.util.List;

@RequiredArgsConstructor
public class PaintingServiceImpl implements PaintingService {
    private final List<Painting> paintingsFromStore;

    @Override
    public Painting takePaintingByName(String name) {
        Painting resPainting = null;
        for (Painting painting : paintingsFromStore) {
            if (painting.getTitle().equals(name)) {
                resPainting = painting;
                break;
            }
        }
        if (resPainting != null) {
            paintingsFromStore.remove(resPainting);
            return resPainting;
        }
        return null;
    }

    @Override
    public void putPainting(Painting painting) {
        paintingsFromStore.add(painting);
    }

    @Override
    public boolean hasPainting(String name) {
        for (Painting painting : paintingsFromStore) {
            if (painting.getTitle().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printPaintings() {
        for (Painting painting : paintingsFromStore) {
            System.out.println(painting.getTitle() + " " + painting.getCreator());
        }
    }
}
