public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
    boolean isPremium;

    // TODO: constructor
    public CloudStorageService(String serviceName,int serviceId,double price){
        super(serviceName,serviceId,price);
        this.isPremium=false;

    }

    @Override
    public void performService() {
        if(getIsActive()){
            if(isPremium){
                System.out.println("Premium cloud");
            } else {
                System.out.println("Normal cloud");
            }
        } else {
            System.out.println("Not active cloud");
        }
    }


    @Override
    public void upgradeToPremium() {
        isPremium=true;
        System.out.println("Premium is active");
        // TODO:
        // set premium = true
        // print message



        // TODO:
        // enable premium
        // print message

    }

    @Override
    public void generateBill() {
        double finalPrice = isPremium ? getPrice() * 1.5 : getPrice();
        System.out.println("Bill amount: " + finalPrice + "$" + toString());
    }

}