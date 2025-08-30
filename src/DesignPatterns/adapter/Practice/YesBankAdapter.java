package DesignPatterns.adapter.Practice;

import DesignPatterns.adapter.Practice.thirdParty.YesBank;

public class YesBankAdapter implements BankAPI{
    YesBank yesBank = new YesBank();

    @Override
    public void sendMoney(String to, String from, int amt) {
        yesBank.moneyTransfer(from, to, amt);
    }
}
