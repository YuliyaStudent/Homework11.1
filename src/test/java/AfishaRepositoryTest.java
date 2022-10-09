import org.junit.jupiter.api.Test;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.*;

public class AfishaRepositoryTest {

    @Test
    public void addTest (){
        AfishaRepository repo = new AfishaRepository();
        repo.save("Бладшот");
        repo.save("Вперед");
        repo.save("Отель Белград");
        repo.save("Джентельмены");
        repo.save("Человек-невидимка");
        repo.save("Тролли.Мировой тур");
        repo.save("Номер один");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены","Человек-невидимка","Тролли.Мировой тур","Номер один"};
        String []actual = repo.findAll();

        assertArrayEquals(expected, actual);

    }
    @Test
    public void addOneMovieTest(){
        AfishaRepository repo = new AfishaRepository();
        repo.save("Бладшот");

        String [] expected = {"Бладшот"};
        String [] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }


}
