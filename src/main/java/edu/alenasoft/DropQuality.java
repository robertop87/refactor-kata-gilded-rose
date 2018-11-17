package edu.alenasoft;

public class DropQuality implements UpdateStrategy {

  @Override
  public void update(Item item) {
    item.setQuality(0);
  }
}
