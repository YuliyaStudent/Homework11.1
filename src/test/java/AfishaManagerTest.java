import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTest {
    @Test
    public void addOneMovieTest() {
        AfishaManager afisha = new AfishaManager();
        afisha.add("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = afisha.findAll();

        assertArrayEquals(expected, actual);
    }


    @Test
    public void addTest() {
        AfishaManager afisha = new AfishaManager();
        afisha.add("Бладшот");
        afisha.add("Вперед");
        afisha.add("Отель Белград");
        afisha.add("Джентельмены");
        afisha.add("Человек-невидимка");
        afisha.add("Тролли.Мировой тур");
        afisha.add("Номер один");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-невидимка", "Тролли.Мировой тур", "Номер один"};
        String[] actual = afisha.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    void findLastTest() {
        AfishaManager afisha = new AfishaManager();
        afisha.add("Бладшот");
        afisha.add("Вперед");
        afisha.add("Отель Белград");
        afisha.add("Джентельмены");
        afisha.add("Человек-невидимка");
        afisha.add("Тролли.Мировой тур");
        afisha.add("Номер один");

        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = afisha.findLast();


    }

    @Test
    public void LimitTest() {
        AfishaManager afisha = new AfishaManager(7);
        afisha.add("Бладшот");
        afisha.add("Вперед");
        afisha.add("Отель Белград");
        afisha.add("Джентельмены");
        afisha.add("Человек-невидимка");
        afisha.add("Тролли.Мировой тур");
        afisha.add("Номер один");


        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = afisha.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void addUnderLimitTest() {
        AfishaManager afisha = new AfishaManager(6);
        afisha.add("Бладшот");
        afisha.add("Вперед");
        afisha.add("Отель Белград");
        afisha.add("Джентельмены");
        afisha.add("Человек-невидимка");
        afisha.add("Тролли.Мировой тур");
        afisha.add("Номер один");

        String[] expected = { "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = afisha.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void addAboveLimitTest() {
        AfishaManager afisha = new AfishaManager(8);
        afisha.add("Бладшот");
        afisha.add("Вперед");
        afisha.add("Отель Белград");
        afisha.add("Джентельмены");
        afisha.add("Человек-невидимка");
        afisha.add("Тролли.Мировой тур");
        afisha.add("Номер один");


        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = afisha.findLast();

        assertArrayEquals(expected, actual);

    }
}


