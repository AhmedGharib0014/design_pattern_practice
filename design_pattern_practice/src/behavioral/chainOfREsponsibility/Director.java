package behavioral.chainOfREsponsibility;

public class Director extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.value < 50){
            System.out.println("request handled by director");
        }else {
            this.Successor.handleRequest(request);
        }
    }
}
