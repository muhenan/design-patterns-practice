package patterns.creational.builder.nolombok;

public class Commodity {
    private final String name;
    private final Integer price;

    // Private constructor
    private Commodity(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
    }

    // Builder class
    public static class Builder {
        private String name;
        private Integer price;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(Integer price) {
            this.price = price;
            return this;
        }

        public Commodity build() {
            validateCommodityData();
            return new Commodity(this);
        }

        private void validateCommodityData() {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalStateException("Name is required");
            }
            if (price == null || price < 0) {
                throw new IllegalStateException("Valid price is required");
            }
        }
    }
}
