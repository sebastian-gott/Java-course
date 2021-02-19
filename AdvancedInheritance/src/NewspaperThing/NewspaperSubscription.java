package NewspaperThing;

public abstract class NewspaperSubscription {

    public String subscriberName;
    public String address;
    public int rate;

    public NewspaperSubscription(String subscriberName, String address, int rate) {
        this.subscriberName = subscriberName;
        this.address = address;
        this.rate = rate;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getAddress() {
        return address;
    }

    public abstract void setAddress(String address);

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
