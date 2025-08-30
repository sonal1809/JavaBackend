package LLD2.adapter.Practice;

import LLD2.adapter.Practice.BankAPI;
import LLD2.adapter.thirdParty.icicibank.ICICIBank;

public class IciciBankAdapter implements BankAPI {

    ICICIBank iciciBank = new ICICIBank();


    @Override
    public void sendMoney(String to, String from, int amt) {
        iciciBank.moneyTransfer(to , amt, from);
    }
}
