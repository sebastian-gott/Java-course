package eksamen;

public class Contract extends Report {

    private String partner;

    public Contract (int number, String title, String subtitle, int year, int fbiNumber, boolean confidential, String partner) {
        super(number, title, subtitle, year, fbiNumber, confidential);
        this.partner = partner;
    }

    public String getPartner() {
        return partner;
    }
    public void setPartner(String newPartner) {
        partner = newPartner;
    }



    public String printContract(){
        return  (super.printInfo() + "Department number: " + fbiNumber + "Title: " + title + "Year: " + year);

    }



}
