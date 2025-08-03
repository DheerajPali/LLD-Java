package designPattern.adaptor;

public class YesBankAPILib {
    public long getBalance(String username, String password){
        return 1000;
    }

    public char doTransaction(String fromUsername, String toUsername, double amount){
        return 'y';
    }

    public int createBankConnection(BankDetails bankDetails){
        return  1;
    }

}
