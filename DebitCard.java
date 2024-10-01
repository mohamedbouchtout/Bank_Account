public abstract class DebitCard implements BankAcc
{
    private int idNum,balance,SecNum,ExDate,pin;
    private String HolderName;
    public DebitCard()
    {
        idNum=0;
        balance=0;
        SecNum=0;
        ExDate=0;
        pin=0;
        HolderName="";
    }
    public DebitCard(int idNum,int balance,int SecNum,int ExDate,int pin,String HolderName)
    {
        this.idNum=idNum;
        this.balance=balance;
        this.SecNum=SecNum;
        this.ExDate=ExDate;
        this.pin=pin;
        this.HolderName=HolderName;
    }
    public void deposite(int num)
    {
        balance=balance+num;
        System.out.println(HolderName+" balance: "+balance);
    }
    public void withdraw(int num)
    {
        if(num>=10000||num>balance)
        {
            System.out.println("You can NOT withdraw more than 10,000 or more than your balance!");
            //withdraw(num);
            //throw new IllegalArgumentExceptin("You can NOT withdraw more than 10,000 or more than your balance!");
        }else{
            balance=balance-num;
            System.out.println(HolderName+" balance: "+balance);
        }
    }
    public void transfer(DebitCard other,int num)
    {
        if (num>balance)
        {
            System.out.println("You don't have enough balance to make this transfer!");
        }else{
            this.balance=balance-num;
            other.balance=balance+num;
            System.out.println(this.HolderName+" balance: "+balance+"        "+other.HolderName+" balance: "+other.balance);
        }
    }
    public int getBalance()
    {
        return balance;
    }
    public int getIdNum()
    {
        return idNum;
    }
    public int getSecNum()
    {
        return SecNum;
    }
    public int getExDate()
    {
        return ExDate;
    }
    public int getPin()
    {
        return pin;
    }
    public String getHolderName()
    {
        return HolderName;
    }
    public String toString()
    {
        return "Name: "+HolderName+", Balance: "+balance+", Card Number: "+idNum+", Pin: "+pin+", Security Number: "+SecNum+", Experation Date: "+ExDate;
    }
}