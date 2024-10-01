public interface BankAcc
{
    public void deposite(int num);
    public void withdraw(int num);
    public void transfer(DebitCard other, int num);
    public int getBalance();
    public int getIdNum();
    public int getSecNum();
    public int getExDate();
    public int getPin();
    public String getHolderName();
    public String toString();
}