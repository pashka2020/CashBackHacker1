package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHack1ServiceTest {

    @Test
    public void shouldCalculateRemainIfLessThan1000() {
        CashbackHack1Service service = new CashbackHack1Service();

        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnZeroIfExact1000() {
        CashbackHack1Service service = new CashbackHack1Service();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}