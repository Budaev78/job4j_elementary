package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenByeBot() {
        String expected = "До скорой встречи";
        String rsl = DummyBot.answer("Пока.");
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenGreetBot() {
        String expected = "Привет, умник";
        String rsl = DummyBot.answer("Привет, Бот.");
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenUnknownBot() {
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String rsl = DummyBot.answer("Сколько будет 2 + 2?");
        Assert.assertEquals(expected, rsl);
    }
}