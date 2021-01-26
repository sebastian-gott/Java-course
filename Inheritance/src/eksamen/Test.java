package eksamen;

public class Test {
    public static void main(String[] args) {

        Report newRepport = new Report( 1, "Iraq", "Saudi", 1996, 421324, true);
        System.out.println(newRepport.printInfo());
        Contract newContract = new Contract(1, "Iraq", "Saudi",0, 0, true, "Bill");
        System.out.println(newContract.printContract());



    }
}
