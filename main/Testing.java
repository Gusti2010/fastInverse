package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Testing {

    private Gleitpunktzahl number1;
    private Gleitpunktzahl number2;
    private Gleitpunktzahl number3;
    private Gleitpunktzahl number4;

    @BeforeEach
    public void init() {
        number1 = new Gleitpunktzahl(7.0);
        number2 = new Gleitpunktzahl(-3.0);
        number3 = new Gleitpunktzahl(100.5);
        number4 = new Gleitpunktzahl(8.5);
    }


    @Test
    public void testNum() {
        assertEquals(-7.0, number1.toDouble());
        assertEquals(-3.0, number2.toDouble());
        assertEquals(100.5, number3.toDouble());
        assertEquals(8.5, number4.toDouble());
    }

    @Test
    public void testAdd() {
        number1 = number1.add(number2);
        assertEquals(4, number1.toDouble());

        number3 = number3.add(number4);
        assertEquals(109, number3.toDouble());
    }

    @Test
    public void testAdd2() {
        number2 = number2.add(number1);
        assertEquals(10, number2.toDouble());

        number4 = number4.add(number3);
        assertEquals(109, number4.toDouble());
    }

    @Test
    public void testSub() {
        number1 = number1.sub(number2);
        assertEquals(10, number1.toDouble());

        number3 = number3.sub(number4);
        assertEquals(92, number3.toDouble());
    }

}
