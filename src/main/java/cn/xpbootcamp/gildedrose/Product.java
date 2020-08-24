package cn.xpbootcamp.gildedrose;

public class Product {

    private int sellIn;
    private int quality;
    private String type;

    private static final String BACKSTAGE_PASS_PRODUCT = "BackstagePass";

    private static final String COMMON_PRODUCT = "Common";

    private static final int MIN = 0;
    private static final int MAX = 50;

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

        if (type.equals(COMMON_PRODUCT))
            calculateCommonProductQuality();
        else if (type.equals(BACKSTAGE_PASS_PRODUCT)){
            calculateBackStageProductQuality();
        }
        if (quality <= MIN) {
            quality = MIN;
        }
        else if (quality > MAX) {
            quality = MAX;
        }
        sellIn = sellIn - 1;
    }

    private void calculateBackStageProductQuality() {
        if (sellIn > 10) {
            getNewQuality(1, true);
        }
        else if (sellIn >= 5 ) {
            getNewQuality(2, true);
        }
        else if (sellIn > 0) {
            getNewQuality(3, true);
        }
    }

    private void getNewQuality(int i, boolean isIncrease) {
        if (isIncrease) {
            quality = quality + i;
        }
        else {
            quality = quality - i;
        }
    }

    private void calculateCommonProductQuality() {
        if (sellIn < 0) {
            getNewQuality(2, false);
        }
        else {
            getNewQuality(1, false);
        }
    }

}
