public class CreditCard extends DebitCard implements BankAcc
{
    private int idNum,balance,SecNum,ExDate,pin;
    private String HolderName;
    public CreditCard()
    {
        super();
        /*
        idNum=0;
        balance=0;
        SecNum=0;
        ExDate=0;
        pin=0;
        HolderName="";
        */
    }
    public CreditCard(int idNum,int balance,int SecNum,int ExDate,int pin,String HolderName)
    {
        super(idNum,balance,SecNum,ExDate,pin,HolderName);
        /*
        this.idNum=idNum;
        this.balance=balance;
        this.SecNum=SecNum;
        this.ExDate=ExDate;
        this.pin=pin;
        this.HolderName=HolderName;
        */
    }
    public void deposit(int num)
    {
        System.out.println("You are NOT allowed to deposite with a CreditCard!");
    }
    /*
    public void withdraw(int num)
    {
        if(num>=10000||num>balance)
        {
            System.out.println("You can NOT withdraw more than 10,000 or more than your balance!");
            withdraw(num);
            //throw new IllegalArgumentExceptin("You can NOT withdraw more than 10,000 or more than your balance!");
        }else{
            balance=-num;
        }
    }
    public void transfer(CreditCard other,int num)
    {
        if (num>balance)
        {
            System.out.println("You don't have enough balance to make this transfer!");
        }else{
            this.balance=-num;
            other.balance=+num;
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
    public String getHolderName()
    {
        return HolderName;
    }
    public String toString()
    {
        return "Name: "+HolderName+", Balance: "+balance+", Card Number: "+idNum+", Pin: "+pin+", Security Number: "+SecNum+", Experation Date: "+ExDate;
    }
    */
}