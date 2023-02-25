package creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        LunchOrder lunchOrder =new LunchOrder.Builder()
                .bread("bread")
                .meat("meat").build();

        System.out.println(lunchOrder);
    }

}
