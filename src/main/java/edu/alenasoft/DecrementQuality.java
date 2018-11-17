package edu.alenasoft;

public class DecrementQuality implements UpdateStrategy {

  private final int minQuality = 0;

  private int decrement;

  public DecrementQuality() {
    this.decrement = 1;
  }

  public DecrementQuality(int decrement) {
    this.decrement = decrement;
  }

  @Override
  public void update(Item item) {
    if (item.getSellIn() <= 0) this.decrement = this.decrement*2;

    if (item.getQuality() <= this.minQuality) return;
    item.setQuality(item.getQuality() - decrement);
    if (item.getQuality() < this.minQuality)
      item.setQuality(this.minQuality);
  }
}
