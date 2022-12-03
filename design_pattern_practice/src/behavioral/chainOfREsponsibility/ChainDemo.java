package behavioral.chainOfREsponsibility;

public class ChainDemo {

    public static void main(String[] args) {
        Director ahmed = new Director();
        Vp micheal = new Vp();
        CEO sherif = new CEO();

        ahmed.setSuccessor(micheal);
        micheal.setSuccessor(sherif);


        Request request = new Request("ahmed",20);
        ahmed.handleRequest(request);

        Request request2 = new Request("ahmed",70);
        ahmed.handleRequest(request2);


        Request request3 = new Request("ahmed",120);
        ahmed.handleRequest(request3);

    }
}
