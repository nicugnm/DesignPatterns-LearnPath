package ro.nicolaemariusghergu.programmingInAnInterface;

interface displayModule {

    public void display();
}

class Monitor implements displayModule {

    @Override
    public void display() {
        System.out.println("Display through monitor");
    }
}

class Projector implements displayModule {

    @Override
    public void display() {
        System.out.println("Display through projector");
    }
}

public class Computer {
    displayModule dm;

    public void setDisplayModule(displayModule displayModule) {
        this.dm = displayModule;
    }

    public void display() {
        dm.display();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();

        displayModule dm = new Monitor();

        displayModule dm1 = new Projector();

        computer.setDisplayModule(dm);
        computer.display();

        computer.setDisplayModule(dm1);
        computer.display();
    }
}