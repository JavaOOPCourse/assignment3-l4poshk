public class Customer extends User {

    // TODO: constructor

    public Customer(String name,int id){
        super(name,id);
    }
    @Override
    public void manageService(Service s) {

        // TODO:
        // print that customer cannot manage services
        System.out.println("customer cannot manage services");

    }

    @Override
    public void useService(Service s) {
        System.out.println("customer is using");
        s.performService();
        // TODO:
        // print customer using message
        // call performService()

    }
}