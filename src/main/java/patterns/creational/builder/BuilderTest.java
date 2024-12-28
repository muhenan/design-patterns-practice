package patterns.creational.builder;

import patterns.creational.builder.lombok.CommodityLombok;
import patterns.creational.builder.nolombok.Commodity;

public class BuilderTest {
    public static void main(String[] args) {
        Commodity commodity = new Commodity.Builder()
                .name("iPhone")
                .price(999)
                .build();

        System.out.println(commodity);


        CommodityLombok commodityLombok = CommodityLombok.builder()
                .name("iPhone")
                .price(999)
                .build();

        System.out.println(commodityLombok);
    }
}
