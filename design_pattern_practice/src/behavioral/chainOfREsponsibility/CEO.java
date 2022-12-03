package behavioral.chainOfREsponsibility;

public class CEO extends Handler{
    @Override
    public void handleRequest(Request request) {
        System.out.println("request handled by CEO");
    }
}
