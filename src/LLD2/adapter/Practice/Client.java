package LLD2.adapter.Practice;

public class Client {
    private static BankAPI bankAPI = new IciciBankAdapter();

    public static void main(String[] args) {
        bankAPI.sendMoney("Priyanka" , "Sonal" , 5000);
    }
}
