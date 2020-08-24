package cn.xpbootcamp.gildedrose;

public class Product {

    private int sellIn;
    private int quality;

    public int getSellIn() {
        return sellIn;
    }
    public int getQuality() {
        return quality;
    }

    public Product(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void calculateCommonProduct() {
        if (quality < 0) {
            quality = 0;
        }
        if (quality > 50) {
            quality = 50;
        }
        if (sellIn < 0) {
            quality = quality - 2;
        }
        else {
            quality = quality - 1;
        }

    }

}
