package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
    @Test
    public void should_return_zero_when_quality_less_than_zero() {
        Product product = new Product(0, 0, "Regular");
        product.calculateProduct();
        int newQuality = product.getQuality();
        int newSellIn = product.getSellIn();
        Assert.assertEquals(0, newQuality);
        Assert.assertEquals(-1, newSellIn);
    }

    @Test
    public void should_return_50_when_quality_more_than_50() {
        Product product = new Product(60, 60, "Regular");
        product.calculateProduct();
        int newQuality = product.getQuality();
        int newSellIn = product.getSellIn();
        Assert.assertEquals(50, newQuality);
        Assert.assertEquals(59, newSellIn);
    }

    @Test
    public void should_decrease_1_when_quality_is_between_0_and_50() {
        Product product = new Product(-1, 6, "Regular");
        product.calculateProduct();
        int newQuality = product.getQuality();
        int newSellIn = product.getSellIn();
        Assert.assertEquals(4, newQuality);
        Assert.assertEquals(-2, newSellIn);
    }

    @Test
    public void should_decrease_1_when_given_sellIn() {
        Product product = new Product(41, 41, "Regular");
        product.calculateProduct();
        int newQuality = product.getQuality();
        int newSellIn = product.getSellIn();
        Assert.assertEquals(40, newQuality);
        Assert.assertEquals(40, newSellIn);
    }

}
