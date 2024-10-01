public class ChechingAcc extends DebitCard implements BankAcc
{
    private int idNum,balance,SecNum,ExDate,pin;
    private String HolderName;
    public ChechingAcc()
    {
        super();
    }
    public ChechingAcc(int idNum,int balance,int SecNum,int ExDate,int pin,String HolderName)
    {
        super(idNum,balance,SecNum,ExDate,pin,HolderName);
    }
}