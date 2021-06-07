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
    public void shouldIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.increaseStation();
        int expected = 3;

        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void shouldIncreaseStationNumberMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void shouldIncreaseStationNumberOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(33);
        radio.increaseStation();
        int expected = 0;

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
    public void shouldDecreaseStationNumberMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseStation();
        int expected = 9;

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
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.increaseVolume();
        int expected = 3;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeOMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(33);
        radio.increaseVolume();
        int expected = 10;

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
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-12);
        radio.decreaseVolume();
        int expected = 0;

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
        radio.setCurrentVolume(10);
        int expected = 10;

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



