package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
    @Test
    public void should_return_zero_when_sellIn_less_than_zero() {
        Product product = new Product(0);
        product.calculateCommonProduct();
        int newSellIn = product.getSellIn();
        Assert.assertEquals(0, newSellIn);
    }
}
