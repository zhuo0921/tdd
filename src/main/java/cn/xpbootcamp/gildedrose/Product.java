package cn.xpbootcamp.gildedrose;

public class Product {

    private int sellIn;
    private int quality;
    private String type;

    private static final String BACKSTAGE_PASS_PRODUCT = "BackstagePass";

    private static final String COMMON_PRODUCT = "Regular";

    public int getSellIn() {
        return sellIn;
    }
    public int getQuality() {
        return quality;
    }

    public Product(int sellIn, int quality, String type) {
        this.sellIn = sellIn;
        this.quality = quality;
        this.type = type;
    }

    public void calculateProduct() {
        if (quality <= 0) {
            quality = 0;
        }
        else if (quality > 50) {
            quality = 50;
        }
        else {
            if (type.equals(COMMON_PRODUCT))
            calculateCommonProductQuality();
            else {
                calculateBackStageProductQuality();
            }
        }
        sellIn = sellIn - 1;
    }

    private void calculateBackStageProductQuality() {
        if (sellIn > 10) {
            quality = quality + 1;
        }
        else if (sellIn >= 5 ) {
            quality = quality + 2;
        }
    }

    private void calculateCommonProductQuality() {
        if (sellIn < 0) {
            quality = quality - 2;
        }
        else {
            quality = quality - 1;
        }
    }

}
