import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<String> createList(String ... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void everyStatement() {
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("0", "#", "0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(createList("#", "2", "#", "1", "1", "2", "1", "#", "#"),
                SILab2.function(createList("#", "0", "#", "0", "0", "0", "0", "#", "#")));
    }
    @Test
    void everyBranch(){
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("0", "#", "0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(createList("#", "2", "#", "1", "1", "2", "1", "#", "#"),
                SILab2.function(createList("#", "0", "#", "0", "0", "0", "0", "#", "#")));
    }
}