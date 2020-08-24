package cn.xpbootcamp.gildedrose;

public class Product {

    private int sellIn;

    public int getSellIn() {
        return sellIn;
    }

    public Product(int sellIn) {
        this.sellIn = sellIn;
    }

    public void calculateCommonProduct() {
        if (sellIn < 0) {
            sellIn = 0;
        }
        if (sellIn > 50) {
            sellIn = 50;
        }
        else {
            sellIn = sellIn - 1;
        }
    }

}
