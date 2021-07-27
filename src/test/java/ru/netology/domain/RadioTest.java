package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {


    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        int expected = 2;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStationUnderMax() {
        Radio radio = new Radio();
        int currentStation = radio.getMaxStation() - 1;
        int expected = radio.getMaxStation();
        radio.setCurrentStation(currentStation);
        radio.increaseStation();
        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void shouldIncreaseStationEqualMax() {
        Radio radio = new Radio();
        int currentStation = radio.getMaxStation();
        int expected = radio.getMinStation();
        radio.setCurrentStation(currentStation);
        radio.increaseStation();
        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void shouldIncreaseStationNumberOverMax() {
        Radio radio = new Radio(10);
        int currentStation = radio.getMaxStation() + 1;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void shouldIncreaseCurrentStationEqualMin() {
        Radio radio = new Radio();
        int currentStation = 0;
        int expected = 1;
        radio.setCurrentStation(currentStation);
        radio.increaseStation();
        assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    public void shouldDecreaseStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.decreaseStation();
        int expected = 1;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStationNumberEqualMin() {
        Radio radio = new Radio();
        int currentStation = 0;
        int expected = radio.getMaxStation();
        radio.setCurrentStation(currentStation);
        radio.decreaseStation();
        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void shouldDecreaseStationNumberUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-10);
        radio.decreaseStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeUnderMax() {
        Radio radio = new Radio();
        int currentVolume = radio.getMaxVolume() - 1;
        int expected = radio.getMaxVolume();
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeOMax() {
        Radio radio = new Radio();
        int currentVolume = radio.getMaxVolume();
        int expected = radio.getMaxVolume();
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeOverMax() {
        Radio radio = new Radio();
        int currentVolume = radio.getMaxVolume() + 1;
        int expected = 0;
        radio.setCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int expected = 4;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeMin() {
        Radio radio = new Radio();
        int currentVolume = radio.getMinVolume();
        int expected = 0;
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeUnderMin() {
        Radio radio = new Radio();
        int currentVolume = radio.getMinVolume() - 1;
        int expected = 0;
        radio.setCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;

        assertEquals(expected, radio.getMaxStation());
    }

    @Test
    public void shouldMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;

        assertEquals(expected, radio.getMinStation());
    }

    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;

        assertEquals(expected, radio.getMaxVolume());
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;

        assertEquals(expected, radio.getMinVolume());
    }
}



