package chainofresponsibility;

public class ConcreteHandlerThree extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request > 0) {
            System.out.println("handling in three");
        }
    }
}
