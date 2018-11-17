package edu.alenasoft;

public class UpdateBackstageQuality implements UpdateStrategy {

  @Override
  public void update(Item item) {
    if (item.getSellIn() > 10) {
      (new IncrementQuality()).update(item);
    } else if (item.getSellIn() > 5) {
      (new IncrementQuality(2)).update(item);
    } else if (item.getSellIn() > 0) {
      (new IncrementQuality(3)).update(item);
    } else {
      item.setQuality(0);
    }
  }
}
