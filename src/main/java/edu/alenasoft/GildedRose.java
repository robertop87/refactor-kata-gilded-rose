package edu.alenasoft;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

  public static List<Item> items = null;

  public static void updateQuality() {
    UpdateStrategy decrementer = new DecrementQuality();
    UpdateStrategy decrementerBy2 = new DecrementQuality(2);
    UpdateStrategy incrementer = new IncrementQuality();
    UpdateStrategy keeper = new KeepQuality();
    UpdateStrategy backstageUpdater = new UpdateBackstageQuality();

    items.forEach(item -> {
      if (item.getName().contains("Aged Brie")) {
        incrementer.update(item);
      } else if (item.getName().contains("Sulfuras")) {
        keeper.update(item);
      } else if (item.getName().contains("Conjured")) {
        decrementerBy2.update(item);
      } else if (item.getName().contains("Backstage")) {
        backstageUpdater.update(item);
      } else {
        decrementer.update(item);
      }
      item.setSellIn(item.getSellIn()-1);
    });
  }
}
