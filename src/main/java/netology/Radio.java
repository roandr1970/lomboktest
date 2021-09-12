package netology;

public class Radio {
    private int numberRadioStations = 10;
    private int currentRadioStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int numberRadioStations) {
        this.numberRadioStations = numberRadioStations;
    }

    public Radio() {
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = numberRadioStations - 1;
        }
    }

    public void nextRadioStation() {
        if (currentRadioStation < (numberRadioStations - 1)) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0){
            return;
        }
        if (currentRadioStation > (numberRadioStations - 1)){
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
}
