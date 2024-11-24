public class Radio {
    private int currentStation = 0;
    private int currentVolume = 0;
    private int numberOfStations; // Новое поле

    // Конструктор по умолчанию
    public Radio() {
        this.numberOfStations = 10; // По умолчанию 10 станций
    }

    // Конструктор с параметром
    public Radio(int numberOfStations) {
        if (numberOfStations > 0) {
            this.numberOfStations = numberOfStations;
        } else {
            this.numberOfStations = 10; // Если параметр некорректный
        }
    }

    public void nextStation() {
        if (currentStation == numberOfStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = numberOfStations - 1;
        } else {
            currentStation--;
        }
    }

    public void setStation(int station) {
        if (station >= 0 && station < numberOfStations) {
            currentStation = station;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    // Методы для громкости остаются без изменений
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            currentVolume = volume;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}