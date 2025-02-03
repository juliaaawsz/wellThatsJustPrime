package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(0), new ArrayList());
  }
  @Test
  void itReturnsAnEmptyListForOne(){
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(1), new ArrayList<>());
  }
  @Test
  void primeNumsForThree(){
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(3), Arrays.asList(3));
  }
  @Test
  void primeNumsForEleven(){
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(11), Arrays.asList(11));
  }
  @Test
  void bigNums(){
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(120), Arrays.asList(2,3,5))
  }
}
