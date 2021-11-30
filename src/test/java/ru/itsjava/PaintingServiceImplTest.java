package ru.itsjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Painting;
import ru.itsjava.services.PaintingService;
import ru.itsjava.services.PaintingServiceImpl;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Класс PaintingServiceImpl должен:")
public class PaintingServiceImplTest {
    public static final String DEFAULT_TITLE = "Мона_Лиза";
    public static final String DEFAULT_CREATOR = "Леонарло_да_Винчи";
    List<Painting> paintingList = new ArrayList<>();

    @DisplayName(" корректно выполнять метод takePaintingByName")
    @Test
    public void shouldHaveCorrectMethodTakePaintingByName(){
        Painting expectedPainting = new Painting(DEFAULT_TITLE, DEFAULT_CREATOR);
        paintingList.add(expectedPainting);
        PaintingService service = new PaintingServiceImpl(paintingList);
        Assertions.assertEquals(expectedPainting, service.takePaintingByName("Мона_Лиза"));
    }

    @DisplayName(" корректно выполнять метод putPainting")
    @Test
    public void shouldHaveCorrectMethodPutPainting(){
        Painting expectedPainting = new Painting(DEFAULT_TITLE, DEFAULT_CREATOR);
//        paintingList.add(expectedPainting);
        PaintingService service = new PaintingServiceImpl(paintingList);
        service.putPainting(expectedPainting);
        Assertions.assertEquals(expectedPainting, paintingList.get(0));
    }

    @DisplayName(" корректно выполнять метод hasPainting")
    @Test
    public void shouldHaveCorrectMethodHasPainting(){
        Painting expectedPainting = new Painting(DEFAULT_TITLE, DEFAULT_CREATOR);
        paintingList.add(expectedPainting);
        PaintingService service = new PaintingServiceImpl(paintingList);
        Assertions.assertTrue(service.hasPainting(DEFAULT_TITLE));
    }

}
