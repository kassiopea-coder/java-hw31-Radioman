package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetMaxStationNumber() {
        Radio radio = new Radio(20);
        assertEquals(20, radio.getMaxStation());
    }

    @Test
    public void shouldSeStationNumberWithinNewMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(18);
        int expected = 18;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldChoseStationNumberWithinNewMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(13);
        int expected = 13;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseWithinNewMaxStationNumber() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(18);
        radio.increaseStation();
        assertEquals(19, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStationNumberNewMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(20);
        radio.increaseStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void shouldIncreaseStationNumberOverNewMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(33);
        radio.increaseStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void shouldDecreaseStationNumberNewMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        radio.decreaseStation();
        int expected = 14;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStationNumberMinNewMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(0);
        radio.decreaseStation();
        int expected = 20;

        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void shouldChoseStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        int expected = 2;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.increaseStation();
        int expected = 3;

        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void shouldIncreaseStationNumberMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
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
        int expected = 10;

        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void shouldDecreaseStationNumberUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-10);
        radio.decreaseStation();
        int expected = 10;

        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void shouldSetVolumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolume(80);
        int expected = 80;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);
        radio.increaseVolume();
        int expected = 56;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeOMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(42);
        radio.decreaseVolume();
        int expected = 41;

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
    public void shouldIncreaseCurrentVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);
        radio.increaseVolume();
        int expected = 100;

        assertEquals(expected, radio.getCurrentVolume());
    }
}



