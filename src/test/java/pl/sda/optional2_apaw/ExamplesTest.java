package pl.sda.optional2_apaw;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Optional;

public class ExamplesTest {


    @Test
    public void whenCreateEmptyOptionalReturnTrue() {

        Optional<String> empty = Optional.empty();
        assertFalse(empty.isPresent());

    }

    @Test
    public void givenNonNull() {
        String name = "testowa wartość";
        Optional<String> opt = Optional.of(name);
        assertEquals("Optional[testowa wartość]", opt.toString());
    }

    @Test(expected = NullPointerException.class)
    public void givenNullWhenErrorOnCreate() {
        String name = null;
        Optional<String> opt = Optional.of(name);
    }

    @Test
    public void givenNullWhenCreateNullable() {
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        assertEquals("Optional.empty", opt.toString());

    }

    @Test
    public void givenOptionalWhenIfPresentOkThenCorrect() {

        Optional<String> name = Optional.ofNullable(null);

        name.ifPresent(n -> System.out.println("Witaj: " + n));

    }

    @Test
    public void whenOrElseWorksThenCorrect() {
        String name = null;
        String nameGood = Optional.ofNullable(name).orElse("Nowe Imie");

        Optional<String> opt = Optional.of("Wartość");
        opt.get();
        System.out.println(opt);
        assertEquals("Nowe Imie", nameGood);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenOrElseWorksThenCorrect1() {
        String name = null;
        String nameGood = Optional.ofNullable(name).orElseThrow(() -> new IllegalArgumentException());

    }
}