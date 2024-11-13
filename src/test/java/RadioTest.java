import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    // Тест для метода nextStation()
    @Test
    public void testNextStation() {
        Radio radio = new Radio();
        radio.setStation(8);
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation());

        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    // Тест для метода prevStation()
    @Test
    public void testPrevStation() {
        Radio radio = new Radio();
        radio.setStation(1);
        radio.prevStation();
        assertEquals(0, radio.getCurrentStation());

        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    // Тест для метода setStation(int) с допустимыми значениями
    @Test
    public void testSetStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    // Тест для метода setStation(int) с недопустимыми значениями
    @Test
    public void testSetStationOutOfRange() {
        Radio radio = new Radio();
        radio.setStation(-1);  // Попытка установить станцию ниже диапазона
        assertEquals(0, radio.getCurrentStation());  // Станция не должна измениться

        radio.setStation(10);  // Попытка установить станцию выше диапазона
        assertEquals(0, radio.getCurrentStation());  // Станция не должна измениться
    }

    // Тест для метода increaseVolume()
    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());

        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());  // Громкость не должна превышать 100
    }

    // Тест для метода decreaseVolume()
    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());  // Громкость не должна опускаться ниже 0
    }

    // Тест для метода setVolume(int) с допустимыми значениями
    @Test
    public void testSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    // Тест для метода setVolume(int) с недопустимыми значениями
    @Test
    public void testSetVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.setVolume(-1);  // Попытка установить громкость ниже диапазона
        assertEquals(0, radio.getCurrentVolume());  // Громкость не должна измениться

        radio.setVolume(101);  // Попытка установить громкость выше диапазона
        assertEquals(0, radio.getCurrentVolume());  // Громкость не должна измениться
    }
}