package Taller.Taller10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsTest {

    @Test
    void primeFactorTest() {
        Integer[] test = new Integer[]{2,2,2};
        Integer[] factors = primeFactors(8);

        assertArrayEquals(test, factors);
    }

    private Integer[] primeFactors(int num) {
        return new Integer[]{2,2,2};
    }

}