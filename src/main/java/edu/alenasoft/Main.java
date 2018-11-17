package edu.alenasoft;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    System.out.println("OMGHAI!");

    GildedRose.items = new ArrayList<Item>();
    GildedRose.items.add(new Item("+5 Dexterity Vest", 10, 20));
    GildedRose.items.add(new Item("Aged Brie", 2, 0));
    GildedRose.items.add(new Item("Elixir of the Mongoose", 5, 7));
    GildedRose.items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    GildedRose.items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
    GildedRose.items.add(new Item("Conjured Mana Cake", 3, 6));

    System.out.println("Antes de la actualizacion");
    GildedRose.items.forEach(System.out::println);
    GildedRose.updateQuality();
    System.out.println("Despues de la actualizacion");
    GildedRose.items.forEach(System.out::println);
  }
}
