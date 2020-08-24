package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
    @Test
    public void should_return_zero_when_quality_less_than_zero() {
        Product product = new Product(0, 0);
        product.calculateCommonProduct();
        int newQuality = product.getQuality();
        Assert.assertEquals(0, newQuality);
    }

    @Test
    public void should_return_50_when_sellIn_more_than_50() {
        Product product = new Product(60, 60);
        product.calculateCommonProduct();
        int newQuality = product.getQuality();
        Assert.assertEquals(50, newQuality);
    }

    @Test
    public void should_decrease_1_when_sellIn_is_between_0_and_50() {
        Product product = new Product(41, 41);
        product.calculateCommonProduct();
        int newQuality = product.getQuality();
        Assert.assertEquals(40, newQuality);
    }

    @Test
    public void should_decrease_1_when_sellIn_given_sellIn() {
        Product product = new Product(41, 41);
        product.calculateCommonProduct();
        int newQuality = product.getSellIn();
        Assert.assertEquals(40, newQuality);
    }
}
