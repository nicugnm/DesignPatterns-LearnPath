package ro.nicolaemariusghergu.dependencyInjection;

public interface Service {

    void write (String message);

}

class ServiceA implements Service {

    @Override
    public void write(String message) {
        System.out.println("Hello World");
    }
}

class Client {
    private Service myService;

    // injects via the constructor
    public Client(Service service) {
        this.myService = service;
    }

    public void doSomething() {
        myService.write("This is a message");
    }

    public void setMyService(Service myService) {
        this.myService = myService;
    }

    public static void main(String[] args) {
        Service service = new ServiceA();
        Client client = new Client(service);
        client.doSomething();
        client.setMyService(service);
    }
}