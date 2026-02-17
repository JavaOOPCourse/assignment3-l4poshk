public class StreamingService extends Service
        implements PremiumFeature {

    // TODO: declare premium field
    boolean isPremium;

    // TODO: constructor
    public StreamingService(String serviceName,int serviceId,double price){
        super(serviceName,serviceId,price);
        this.isPremium=false;

    }

    @Override
    public void performService() {
        if(getIsActive()){
            if(isPremium){
                System.out.println("Premium streaming perform");
            } else {
                System.out.println("Normal streaming");
            }
        } else {
            System.out.println("Streaming not active");
        }
    }


    @Override
    public void upgradeToPremium() {
    isPremium=true;
    System.out.println("Premium is active");
        // TODO:
        // set premium = true
        // print message

    }
}