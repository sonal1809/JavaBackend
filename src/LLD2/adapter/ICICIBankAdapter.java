package LLD2.adapter;

import LLD2.adapter.thirdParty.icicibank.ICICIBank;

public class ICICIBankAdapter implements  BankAPI{

    private ICICIBank iciciBank = new ICICIBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        iciciBank.moneyTransfer(to, amount, from);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long getBalance(String accountNumber) {
        return 0;
    }
}
