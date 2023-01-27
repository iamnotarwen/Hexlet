package Hexlet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class StudyTest {
        @Test
        public void StudyNormalNumbers() {

            Study fb = new Study();
            Assertions.assertEquals("1", fb.convert(1));
            Assertions.assertEquals("2", fb.convert(2));
        }

        @Test
        public void StudyThreeNumbers() {

            Study fb = new Study();
            Assertions.assertEquals("Fizz", fb.convert(3));
        }

        @Test
        public void StudyFiveNumbers() {

            Study fb = new Study();
            Assertions.assertEquals("Buzz", fb.convert(5));
        }

        @Test
        public void StudyThreeAndFiveNumbers() {

            Study fb = new Study();
            Assertions.assertEquals("Buzz", fb.convert(5));
        }
    }

