public class Radio {
    private int currentStation;
    private int currentVolume;

    private int numberOfStations = 10;
    private int maxVolum = 100;
    private int minVolum = 0;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < numberOfStations && newStation >= 0) {
            currentStation = newStation;
        }
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume >= minVolum && newVolume <= maxVolum) {
            currentVolume = newVolume;
        }
    }


    public void next() {
        if (currentStation == numberOfStations - 1) {
            currentStation = 0;
        } else {
            currentStation += 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = numberOfStations - 1;
        } else {
            currentStation -= 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolum) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolum) {
            currentVolume = currentVolume - 1;
        }
    }
}