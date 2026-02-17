public abstract class Service {

    // TODO: declare private fields
    private String serviceName;
    private int serviceId;
    private boolean isActive;
    private double price;


    // TODO: constructor
    public Service(String serviceName,int serviceId,double price){
        this.serviceName=serviceName;
        this.serviceId=serviceId;
        this.isActive=false;
        this.price=price;
    }

    // TODO: activateService()
    public void activateService(){
        this.isActive=true;
        System.out.println("Service activate");
    }
    // should set isActive = true
    // print activation message


    // TODO: deactivateService()
    public void deactivateService(){
        this.isActive=false;
        System.out.println("Service deactivate");
    }
    // should set isActive = false
    // print deactivation message


    // TODO: getter for serviceName
        public String getServiceName(){
        return this.serviceName;
        }

    // TODO: getter for isActive
        public boolean getIsActive(){
        return this.isActive;
        }

        public double getPrice(){
        return this.price;
        }

    // TODO: abstract method performService()
        public abstract void performService();

    @Override
    public String  toString(){
        return (" Service name : " + this.serviceName);

    }

}