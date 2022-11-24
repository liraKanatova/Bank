public class Bank  implements ServiceAble{

    private long bankAccaunt;

    public Bank(long bankAccaunt) {
        this.bankAccaunt = bankAccaunt;
    }



    public long getBankAccaunt() {
        return bankAccaunt;
    }

    public void setBankAccaunt(long bankAccaunt) {
        this.bankAccaunt = bankAccaunt;
    }



    @Override
    public void transferMoney(Payments payments){
        if(getBankAccaunt() <= 0) System.err.println("TransferMoney Error. Bank Account is less than 0.");
        else System.out.println("TransferMoney : " + payments);
    }



    @Override
    public void transferMoney(Payments payments, String phoneNumber) {
        if(getBankAccaunt() <= 0) System.err.println("TransferMoney Error. Balance is less than 0.");
        else System.out.println("TransferMoney : "+payments+" | Phone number : " + phoneNumber);
    }
}
