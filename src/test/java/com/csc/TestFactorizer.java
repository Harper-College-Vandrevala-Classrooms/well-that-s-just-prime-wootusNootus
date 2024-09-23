package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

  Factorizer factorizer;

  @BeforeEach
  void setUp() {
    factorizer = new Factorizer();
  }


  @Test
  public void testZero() {
    assertEquals("Prime factors for 46: 2, 23.", factorizer.primeFactors(46));
  }

  @Test
  public void testOne() {
    assertEquals("Prime factors for 224: 2, 7.", factorizer.primeFactors(224));
  }

  @Test
  public void testTwo() {
    assertEquals("null", factorizer.primeFactors(0));
  }

  @Test
  public void testThree() {
    assertEquals("Prime factors for 60: 2, 3, 5.", factorizer.primeFactors(60));
  }

  @Test
  public void testFour() {
    assertEquals("null", factorizer.primeFactors(-10));
  }
  
  @Test
  public void testFive() {
    assertEquals(true, factorizer.isComposite(36));
  }

  @Test
  public void testSix() {
    assertEquals(true, factorizer.isComposite(12));
  }

  @Test
  public void testSeven() {
    assertEquals(false, factorizer.isComposite(17));
  }

  @Test
  public void testEight() {
    assertEquals(false, factorizer.isComposite(1));
  }

  @Test
  public void testNine() {
    assertEquals(false, factorizer.isComposite(0));
  }
}
