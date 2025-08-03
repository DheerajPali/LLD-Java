package designPattern.adaptor;

public class ICICIBankAdapter implements BankAPIAdapter{
    private ICICIBankApiLib iciciBankApiLib;

    public  ICICIBankAdapter(){
        this.iciciBankApiLib = new ICICIBankApiLib();
    }
    @Override
    public double checkBalance(User user) {
        return iciciBankApiLib.checkBalance(user.getToken());
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {
        int result=  iciciBankApiLib.transferMoney(fromUser.getToken(),toUser.getToken(), amount);
        return  result;
    }

    @Override
    public boolean addBankDetails(BankDetails bankDetails) {
        boolean result = iciciBankApiLib.addBankAccount(bankDetails.getAccountNumber(), bankDetails.getIfsc(), bankDetails.getPhoneNumber(), bankDetails.getPin());
        return  result;
    }
}
