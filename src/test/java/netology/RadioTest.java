package netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio(7);
    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(20);
        radio.increaseVolume();
        int expected = 21;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        radio.setCurrentRadioStation(5);
        radio.prevRadioStation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevMinRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        radio.setCurrentRadioStation(5);
        radio.nextRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextMaxRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation() {
        radio.setCurrentRadioStation(4);
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
        radio.setCurrentRadioStation(7);
        expected = 4;
        actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
        radio.setCurrentRadioStation(-1);
        expected = 4;
        actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
}