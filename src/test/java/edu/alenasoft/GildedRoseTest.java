package edu.alenasoft;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Test;

public class GildedRoseTest {

  @Test
  public void testNormalItemDecrementQuality() {
    // Contexto
    GildedRose.items = new ArrayList<>();
    int inputQuality = 20;
    Item item = new Item("+5 Dexterity Vest", 10, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = inputQuality - 1;

    assertEquals(expectedQuality, item.getQuality());
  }


  @Test
  public void testNormalItemDoubleDecrementQuality() {
    // Contexto
    GildedRose.items = new ArrayList<>();
    int inputQuality = 20;
    Item item = new Item("+5 Dexterity Vest", 0, inputQuality);

    GildedRose.items.add(item);
    GildedRose.updateQuality();

    int expectedQuality = inputQuality - 2;

    assertEquals(expectedQuality, item.getQuality());
  }

}