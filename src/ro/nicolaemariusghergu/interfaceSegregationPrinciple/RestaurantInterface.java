package ro.nicolaemariusghergu.interfaceSegregationPrinciple;

// TODO: exercise to understand principle
public interface RestaurantInterface {

    public void acceptOnlineOrder();

    public void takeTelephoneOrder();

    public void payOnline();

    public void walkInCustomerOrder();

    public void payInPerson();

}

class OnlineClientImpl implements RestaurantInterface {


    @Override
    public void acceptOnlineOrder() {

    }

    @Override
    public void takeTelephoneOrder() {

    }

    @Override
    public void payOnline() {

    }

    @Override
    public void walkInCustomerOrder() {

    }

    @Override
    public void payInPerson() {

    }
}
