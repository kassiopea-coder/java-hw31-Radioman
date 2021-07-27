package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int maxStation;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation)
            return;
        if (currentStation < minStation)
            return;
        this.currentStation = currentStation;
    }

    public void increaseStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

        public void decreaseStation() {
            if (currentStation > minStation) {
                currentStation = currentStation - 1;
            } else {
                currentStation = maxStation;
            }
        }

    //volume

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume)
            return;
        if (currentVolume < minVolume)
            return;
        this.currentVolume = currentVolume;
    }

    void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

        void decreaseVolume() {
            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
            }
        }
    }
