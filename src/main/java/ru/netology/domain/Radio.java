package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int amountStation = 10;

    public Radio() {
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public void increaseStation() {
        if (currentStation == amountStation - 1) {
            this.currentStation = 0;
            return;
        } else {
            this.currentStation++;
            return;
        }
    }

    public void decreaseStation() {
        if (currentStation == minStation) {
            this.currentStation = amountStation - 1;
            return;
        } else {
            this.currentStation--;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > amountStation - 1) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    //volume

    public boolean isMaxVolume(int currentVolume){
        return currentVolume == 100;
    }

    public boolean isMinVolume(int currentVolume){
        return currentVolume == 0;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume--;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

}
