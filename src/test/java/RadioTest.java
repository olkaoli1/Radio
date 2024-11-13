import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    // Тест для метода nextStation()
    @Test
    public void testNextStation() {
        Radio radio = new Radio();
        radio.setStation(8);
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation()); // Проверяем, что станция переключилась на 9

        radio.nextStation();
        assertEquals(0, radio.getCurrentStation()); // Проверяем, что станция вернулась на 0 после 9
    }

    // Тест для метода prevStation()
    @Test
    public void testPrevStation() {
        Radio radio = new Radio();
        radio.setStation(1);
        radio.prevStation();
        assertEquals(0, radio.getCurrentStation()); // Проверяем, что станция переключилась на 0

        radio.prevStation();
        assertEquals(9, radio.getCurrentStation()); // Проверяем, что станция вернулась на 9 после 0
    }

    // Тест для метода setStation()
    @Test
    public void testSetStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        assertEquals(5, radio.getCurrentStation()); // Проверяем установку станции на допустимое значение

        radio.setStation(10); // Недопустимое значение
        assertEquals(5, radio.getCurrentStation()); // Убедитесь, что станция не изменилась
    }

    // Тест для метода increaseVolume()
    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume()); // Проверяем, что громкость увеличилась до 100

        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume()); // Проверяем, что громкость не превышает 100
    }

    // Тест для метода decreaseVolume()
    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume()); // Проверяем, что громкость уменьшилась до 0

        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume()); // Проверяем, что громкость не опускается ниже 0
    }

    // Тест для метода setVolume()
    @Test
    public void testSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        assertEquals(50, radio.getCurrentVolume()); // Проверяем установку громкости на допустимое значение

        radio.setVolume(150); // Недопустимое значение
        assertEquals(50, radio.getCurrentVolume()); // Убедитесь, что громкость не изменилась
    }
}
