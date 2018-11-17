package edu.alenasoft;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GildedRoseTest {

  @Before
  public void setUp() {
    GildedRose.items = new ArrayList<>();
  }

  @Test
  public void testDecrementQuality() {
    // Create the item
    Item normalItem = new Item("Pan Frances", 2, 2);

    // Add item to GildedRose [GR]
    GildedRose.items.add(normalItem);

    // Execute GR
    GildedRose.updateQuality();

    Item result = GildedRose.items.get(0);

    Assert.assertEquals(1, result.getSellIn());
    Assert.assertEquals(1, result.getQuality());
  }

  @Test
  public void testDecrement2xQualityWhenSellInIsZero() {
    // Create the item
    Item normalItem = new Item("Pan Frances", 0, 10);

    // Add item to GildedRose [GR]
    GildedRose.items.add(normalItem);

    // Execute GR
    GildedRose.updateQuality();

    Item result = GildedRose.items.get(0);

    Assert.assertEquals(8, result.getQuality());
  }

  @Test
  public void testQualityInNeverNegative() {
    // Create the item
    Item normalItem = new Item("Pan Frances", 5, 0);

    // Add item to GildedRose [GR]
    GildedRose.items.add(normalItem);

    // Execute GR
    GildedRose.updateQuality();

    Item result = GildedRose.items.get(0);

    Assert.assertEquals(0, result.getQuality());
  }

  @Test
  public void testAgedBrieIncreaseQuality() {
    // Add item to GildedRose [GR]
    GildedRose.items.add(new Item("Aged Brie", 2, 0));

    // Execute GR
    GildedRose.updateQuality();

    Item result = GildedRose.items.get(0);

    Assert.assertEquals(1, result.getQuality());
  }

  @Test
  public void testQualityNeverIncreaseMoreThanFifty() {
    // Add item to GildedRose [GR]
    GildedRose.items.add(new Item("Aged Brie", 2, 50));

    // Execute GR
    GildedRose.updateQuality();

    Item result = GildedRose.items.get(0);

    Assert.assertEquals(50, result.getQuality());
  }

  @Test
  public void testSulfurasNeverChangeQuality() {
    // Add item to GildedRose [GR]
    GildedRose.items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));

    // Execute GR
    GildedRose.updateQuality();

    Item result = GildedRose.items.get(0);

    Assert.assertEquals(80, result.getQuality());
  }

  @Test
  public void testBackstageQualityWhenSellInGreaterThanTen() {
    // Add item to GildedRose [GR]
    GildedRose.items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));

    // Execute GR
    GildedRose.updateQuality();

    Item result = GildedRose.items.get(0);

    Assert.assertEquals(21, result.getQuality());
  }

  @Test
  public void testBackstageQualityWhenSellInIsTen() {
    // Add item to GildedRose [GR]
    GildedRose.items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20));

    // Execute GR
    GildedRose.updateQuality();

    Item result = GildedRose.items.get(0);

    Assert.assertEquals(22, result.getQuality());
  }

  @Test
  public void testBackstageQualityWhenSellInGreaterThanFiveAndLessThanTen() {
    // Add item to GildedRose [GR]
    GildedRose.items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 9, 20));

    // Execute GR
    GildedRose.updateQuality();

    Item result = GildedRose.items.get(0);

    Assert.assertEquals(22, result.getQuality());
  }

  @Test
  public void testBackstageQualityWhenSellInGreaterThanZeroAndLessThanFive() {
    // Add item to GildedRose [GR]
    GildedRose.items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 4, 20));

    // Execute GR
    GildedRose.updateQuality();

    Item result = GildedRose.items.get(0);

    Assert.assertEquals(23, result.getQuality());
  }

  @Test
  public void testBackstageQualityWhenSellInIsFive() {
    // Add item to GildedRose [GR]
    GildedRose.items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20));

    // Execute GR
    GildedRose.updateQuality();

    Item result = GildedRose.items.get(0);

    Assert.assertEquals(23, result.getQuality());
  }

  @Test
  public void testBackstageQualityWhenSellInIsZero() {
    // Add item to GildedRose [GR]
    GildedRose.items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20));

    // Execute GR
    GildedRose.updateQuality();

    Item result = GildedRose.items.get(0);

    Assert.assertEquals(0, result.getQuality());
  }

  @Test
  public void testConjuredQualityDecrease() {
    // Add item to GildedRose [GR]
    GildedRose.items.add(new Item("Conjured Mana Cake", 10, 6));

    // Execute GR
    GildedRose.updateQuality();

    Item result = GildedRose.items.get(0);

    Assert.assertEquals(4, result.getQuality());
  }

  @Test
  public void testConjuredQualityDecrease2xWhenSellInZero() {
    // Add item to GildedRose [GR]
    GildedRose.items.add(new Item("Conjured Mana Cake", 0, 10));

    // Execute GR
    GildedRose.updateQuality();

    Item result = GildedRose.items.get(0);

    Assert.assertEquals(6, result.getQuality());
  }

  @Test
  public void testConjuredQualityNeverNegative() {
    // Add item to GildedRose [GR]
    GildedRose.items.add(new Item("Conjured Mana Cake", 5, 0));

    // Execute GR
    GildedRose.updateQuality();

    Item result = GildedRose.items.get(0);

    Assert.assertEquals(0, result.getQuality());
  }
}
