package DesignPatterns.adapter.Practice;

import DesignPatterns.adapter.thirdParty.icicibank.ICICIBank;

public class IciciBankAdapter implements BankAPI {

    ICICIBank iciciBank = new ICICIBank();


    @Override
    public void sendMoney(String to, String from, int amt) {
        iciciBank.moneyTransfer(to , amt, from);
    }
}
