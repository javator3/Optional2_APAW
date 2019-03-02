package pl.sda.optional2_apaw;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Optional;

public class ExamplesTest {


    @Test
    public void whenCreateEmptyOptionalReturnTrue (){

        Optional<String> empty = Optional.empty();
        assertFalse(empty.isPresent());

    }

    @Test
    public void givenNonNull (){
        String name = "testowa wartość";
        Optional<String> opt = Optional.of(name);
        assertEquals("Optional[testowa wartość]", opt.toString());
    }

    @Test(expected = NullPointerException.class)
    public void givenNullWhenErrorOnCreate (){
        String name = null;
        Optional<String> opt = Optional.of(name);
    }

}