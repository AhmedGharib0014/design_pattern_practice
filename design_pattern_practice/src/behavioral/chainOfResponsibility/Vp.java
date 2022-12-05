package behavioral.chainOfResponsibility;

public class Vp extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.value < 100){
            System.out.println("request handled by Vp");
        }else {
            this.Successor.handleRequest(request);
        }
    }
}
