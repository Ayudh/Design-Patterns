package chainofresponsibility;

public class ConcreteHandlerTwo extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request == 0) {
            System.out.println("Handling in two");
        } else {
            successor.handleRequest(request);
        }
    }
}
