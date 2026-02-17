public class Admin extends User {

    // TODO: constructor
    public Admin(String name,int id){
        super(name,id);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("admin managing message");
        // TODO:
        // print admin managing message

    }

    @Override
    public void useService(Service s) {
        System.out.println("admin is using");
        s.performService();
        // TODO:
        // print admin using message
        // call performService()

    }
}