package creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        GraderFactory factory =new GraderFactoryImpl();

        System.out.println(factory.instance(GraderType.COMPLETE).getClass().getName());
        System.out.println(factory.instance(GraderType.MCQ).getClass().getName());


    }
}
