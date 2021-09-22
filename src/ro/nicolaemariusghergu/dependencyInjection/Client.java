package ro.nicolaemariusghergu.dependencyInjection;

public class Client {

    // Internal reference to this service used by this client
    private ExampleService service;

    Client() {
        // specify a specific implementation in the constructor instead of using
        // dependency injection
        service = new ExampleService();
    }

    // Method within this client that uses the services`
    public String greet() {
        return "Hello " + service.getName();
    }
}
