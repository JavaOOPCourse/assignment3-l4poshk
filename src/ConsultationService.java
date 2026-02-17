public class ConsultationService extends Service
        implements Billable {

    // TODO: constructor
    public ConsultationService(String serviceName,int serviceId,double price){
        super(serviceName,serviceId,price);


    }

    @Override
    public void performService() {
        if(getIsActive()){
            System.out.println("Consultation active");
        } else {
            System.out.println("Consultation not active");
        }
    }



    @Override
    public void generateBill() {

        // TODO:
        // print billing messag
        System.out.println("Bill amount : " + getPrice() + "$" + toString());

    }
}