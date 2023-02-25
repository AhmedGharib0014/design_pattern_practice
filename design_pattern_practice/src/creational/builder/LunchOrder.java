package creational.builder;

public class LunchOrder {

    private final String bread;
    private final String meat;

    public static class Builder{

        private  String bread;
        private  String meat;

        public Builder bread(String bread){
            this.bread=bread;
            return this;
        }


        public Builder meat(String meat){
            this.meat=meat;
            return this;
        }

        public LunchOrder build(){
            return new LunchOrder(this);
        }

    }

    public LunchOrder(Builder builder){
        this.meat= builder.meat;
        this.bread= builder.bread;
    }

    public LunchOrder(String bread, String meat) {
        this.bread = bread;
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    @Override
    public String toString() {
        return "LunchOrder{" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }
}
