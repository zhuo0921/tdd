package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
    @Test
    public void should_return_zero_when_quality_less_than_zero() {
        Product product = new Product(0, 0, "Common");
        product.calculateProduct();
        int newQuality = product.getQuality();
        int newSellIn = product.getSellIn();
        Assert.assertEquals(0, newQuality);
        Assert.assertEquals(-1, newSellIn);
    }

    @Test
    public void should_return_50_when_quality_more_than_50() {
        Product product = new Product(60, 60, "Common");
        product.calculateProduct();
        int newQuality = product.getQuality();
        int newSellIn = product.getSellIn();
        Assert.assertEquals(50, newQuality);
        Assert.assertEquals(59, newSellIn);
    }

    @Test
    public void should_decrease_1_when_quality_is_between_0_and_50() {
        Product product = new Product(-1, 6, "Common");
        product.calculateProduct();
        int newQuality = product.getQuality();
        int newSellIn = product.getSellIn();
        Assert.assertEquals(4, newQuality);
        Assert.assertEquals(-2, newSellIn);
    }

    @Test
    public void should_decrease_1_when_given_sellIn() {
        Product product = new Product(41, 41, "Common");
        product.calculateProduct();
        int newQuality = product.getQuality();
        int newSellIn = product.getSellIn();
        Assert.assertEquals(40, newQuality);
        Assert.assertEquals(40, newSellIn);
    }

    @Test
    public void should_increase_1_when_type_is_backStage_and_sellIn_more_than_10() {
        Product product = new Product(11, 41, "BackstagePass");
        product.calculateProduct();
        int newQuality = product.getQuality();
        int newSellIn = product.getSellIn();
        Assert.assertEquals(42, newQuality);
        Assert.assertEquals(10, newSellIn);
    }

    @Test
    public void should_increase_2_when_type_is_backStage_and_sellIn_between_5_and_10() {
        Product product = new Product(6, 41, "BackstagePass");
        product.calculateProduct();
        int newQuality = product.getQuality();
        int newSellIn = product.getSellIn();
        Assert.assertEquals(43, newQuality);
        Assert.assertEquals(5, newSellIn);
    }

    @Test
    public void should_increase_3_when_type_is_backStage_and_sellIn_less_than_5() {
        Product product = new Product(4, 40, "BackstagePass");
        product.calculateProduct();
        int newQuality = product.getQuality();
        int newSellIn = product.getSellIn();
        Assert.assertEquals(43, newQuality);
        Assert.assertEquals(3, newSellIn);
    }

    @Test
    public void should_increase_3_when_type_is_backStage_and_sellIn_less_than_5_and_new_quality_more_than_50() {
        Product product = new Product(10, 49, "BackstagePass");
        product.calculateProduct();
        int newQuality = product.getQuality();
        int newSellIn = product.getSellIn();
        Assert.assertEquals(50, newQuality);
        Assert.assertEquals(9, newSellIn);
    }

}
