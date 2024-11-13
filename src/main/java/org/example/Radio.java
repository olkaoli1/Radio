public class Radio {
    private int currentStation = 0; // Номер текущей радиостанции (от 0 до 9)
    private int currentVolume = 0;  // Уровень громкости звука (от 0 до 100)

    // Метод для переключения на следующую станцию
    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    // Метод для переключения на предыдущую станцию
    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    // Метод для установки конкретного номера станции
    public void setStation(int station) {
        if (station >= 0 && station <= 9) {
            currentStation = station;
        }
    }

    // Метод для получения текущего номера станции
    public int getCurrentStation() {
        return currentStation;
    }

    // Метод для увеличения громкости
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    // Метод для уменьшения громкости
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    // Метод для установки конкретного уровня громкости
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            currentVolume = volume;
        }
    }

    // Метод для получения текущего уровня громкости
    public int getCurrentVolume() {
        return currentVolume;
    }
}