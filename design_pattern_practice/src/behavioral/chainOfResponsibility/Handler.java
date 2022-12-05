package behavioral.chainOfResponsibility;

public abstract class Handler {

    public Handler Successor;

    public void setSuccessor(Handler successor) {
        Successor = successor;
    }

    public  abstract void  handleRequest(Request request);
}
