package chainofresponsibility;

public class ConcreteHandlerOne extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request < 0) {
            System.out.println("Handling in First");
        } else {
            successor.handleRequest(request);
        }
    }
}
