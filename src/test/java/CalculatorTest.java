import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();



    @Test
    void divide() {
        assertAll("Assert all",
                () -> assertEquals(3, calculator.divide(9, 3)),
                () -> assertEquals(1, calculator.divide(3, 3)),
                () -> assertEquals(2, calculator.divide(5, 2)),
                () -> assertEquals(2.5, calculator.divide(5, 2)),
                () -> assertEquals(2.5, calculator.divide(5, 2))
        );
    }
    @Test
    void timeOutTest(){
        assertTimeout(Duration.ofMillis(3),
                () -> calculator.calculateTotalInterval(0, 500000)
                );
    }
    @AfterAll
    static void delete(){
        System.out.println("End tests");
    }
}