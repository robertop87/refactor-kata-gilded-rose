package edu.alenasoft;

public class IncrementQuality implements UpdateStrategy {

  private final int increment;

  public IncrementQuality() {
    this.increment = 1;
  }

  public IncrementQuality(int increment) {
    this.increment = increment;
  }

  @Override
  public void update(Item item) {
    if (item.getQuality() >=50) return;
    item.setQuality(item.getQuality() + this.increment);
  }
}
