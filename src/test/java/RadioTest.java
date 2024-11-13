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

    @Test
    public void testSetStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testSetStationOutOfRange() {
        Radio radio = new Radio();
        radio.setStation(-1);
        assertEquals(0, radio.getCurrentStation());

        radio.setStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());

        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void testSetVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        assertEquals(0, radio.getCurrentVolume());

        radio.setVolume(101);
        assertEquals(0, radio.getCurrentVolume());
    }
}