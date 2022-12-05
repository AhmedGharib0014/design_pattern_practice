package behavioral.chainOfResponsibility;

public class CEO extends Handler{
    @Override
    public void handleRequest(Request request) {
        System.out.println("request handled by CEO");
    }
}
