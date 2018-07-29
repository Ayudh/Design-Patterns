package chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandlerOne();
        Handler h2 = new ConcreteHandlerTwo();
        Handler h3 = new ConcreteHandlerThree();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        h1.handleRequest(-1);
        h1.handleRequest(0);
        h1.handleRequest(1);

    }
}
