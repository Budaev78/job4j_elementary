package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(10, 4, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 12);
        assertThat(result, is(12));
    }

    @Test
    public void whenNotMax() {
        int result = MultiMax.max(4, 4, 4);
        assertThat(result, is(0));
    }
}