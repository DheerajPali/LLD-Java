package designPattern.adaptor;

public class YESBankAPIAdapter implements BankAPIAdapter{
    private YesBankAPILib yesBankAPILib;

    public  YESBankAPIAdapter(){
        this.yesBankAPILib = new YesBankAPILib();
    }

    @Override
    public boolean addBankDetails(BankDetails bankDetails) {
        int res =  yesBankAPILib.createBankConnection(bankDetails);
        return res == 1;
    }

    @Override
    public double checkBalance(User user) {
        long balance = yesBankAPILib.getBalance(user.getUserName(), user.getUserName());
        return balance;
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {
        char res = yesBankAPILib.doTransaction(fromUser.getUserName(), toUser.getUserName(), amount);
        if(res == 'y') return 1;
        else if (res == 'n') return 0;
        else return 2;
    }
}
