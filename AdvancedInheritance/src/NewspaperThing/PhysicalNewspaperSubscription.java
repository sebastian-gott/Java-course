package NewspaperThing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhysicalNewspaperSubscription extends  NewspaperSubscription {


    public PhysicalNewspaperSubscription(String subscriberName, String address, int rate) {
        super(subscriberName, address, rate);
    }



    @Override
    public void setAddress(String address) {
        Pattern pattern = Pattern.compile("(.)*(\\d)(.)*");
        Matcher matcher =  pattern.matcher(address);
        if(!matcher.matches()) {
            System.out.println("Adressen må inneholde tall");
            setRate(0);
        } else {
            this.address = address;
            setRate(15);
        }
    }

    @Override
    public String toString() {
        return getSubscriberName() + " " + getAddress() + " " + getRate() + " ,";
    }
}
