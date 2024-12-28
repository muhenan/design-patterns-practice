package patterns.creational.builder.lombok;

import lombok.Builder;
import lombok.NonNull;

@Builder
public class CommodityLombok {
    @NonNull
    private final String name;
    @NonNull
    private final Integer price;
}
