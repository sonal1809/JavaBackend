package LLD2.adapter;

public class PhonePe {
    private  static BankAPI bankAPI = new ICICIBankAdapter();

    public static void main(String[] args) {
        bankAPI.sendMoney("74839" , "2345543" , 1000);
    }
}
