package eksamen;

public class Report extends Docs {

    public int fbiNumber;
    public boolean confidential;

    public Report (int number, String title, String subtitle, int year, int fbiNumber, boolean confidential) {
        super(number, title, subtitle, year);
        this.fbiNumber = fbiNumber;
        this.confidential = confidential;

    }

    public void setNumber(int newFbiNumber) {
        fbiNumber = newFbiNumber;
    }

    public void setConfidential(boolean newConfidential) {
        confidential = newConfidential;
    }

    public int getDepartment() {
        return fbiNumber;
    }

    public boolean isConfidential() {
        return confidential;
    }

    @Override
    public String printInfo() {
        return (super.printInfo() + " the department number is " + fbiNumber + ". Is confidential: " + confidential);
    }



}
