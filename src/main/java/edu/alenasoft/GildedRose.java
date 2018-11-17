package edu.alenasoft;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

  public static List<Item> items = null;

  public static void updateQuality() {
    items.forEach(item -> {
      UpdateStrategy strategy = getStrategy(item);
      strategy.update(item);
      item.setSellIn(item.getSellIn() - 1);
    });
  }

  // Inicio del patron Factory
  public static UpdateStrategy getStrategy(Item item) {
    if (item.getName().contains("Aged Brie")) {
      return new IncrementQuality();
    } else if (item.getName().contains("Sulfuras")) {
      return new KeepQuality();
    } else if (item.getName().contains("Conjured")) {
      return new DecrementQuality(2);
    } else if (item.getName().contains("Backstage")) {
      return new UpdateBackstageQuality();
    } else {
      return new DecrementQuality();
    }
  }
}
