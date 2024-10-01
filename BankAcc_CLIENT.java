import java.io.*;
import java.util.*;
public class BankAcc_CLIENT
{
    static Random rand=new Random();
    static Scanner console = new Scanner(System.in);
    int date=0723;
    public static void main()
    {
        final int date=0723;
        ArrayList<DebitCard> list=new ArrayList<DebitCard>();
        DebitCard mb=new ChechingAcc(123456789,0,123,0725,1234,"Mohamed Bouchtout");
        DebitCard ab=new ChechingAcc(123456781,0,124,0724,1235,"Ayoub Bouchtout");
        list.add(mb);
        list.add(ab);
        mb.deposite(10000);
        ab.deposite(10000);
        System.out.println("Hi, how can I help you today? Please don't use spaces when typing. Enter STOP by itself to end conversation at anytime.");
        int n=0;
        while(n<1){
            String answer=console.next();
            System.out.println("answer: "+answer);
            if(subString("debitcard",answer)){
                System.out.println("Can you specify what kind of depit card you want.");
            }else if(subString("creditcard",answer)){
                creditCard(list,date);
            }else if(subString("chechingaccount",answer)){
                chechingAcc(list,date);
            }else if(subString("savingaccount",answer)){
                savingAcc(list,date);
            }else if(subString("balance",answer)){
                balance(list,date);
            }else if(subString("deposite",answer)){
                deposite(list,date);
            }else if(subString("withdraw",answer)){
                withdraw(list,date);
            }else if(subString("info",answer)){
                info(list,date);
            }else if(subString("transfer",answer)){
                transfer(list,date);
            }else if(end()){
                System.out.println("Have a good day!");
                break;
            }else{
                System.out.println("I'm not sure what your saying, can you rephrase please.");
            }
        }
    }
    
    public static void creditCard(ArrayList<DebitCard> list,int date)
    {
        System.out.println("And can you give me a 4 digit pin you want.");
        int pin=console.nextInt();
        System.out.println("And can you give me you full name.");
        String name=console.next();
        int x=rand.nextInt(100000000,1000000000);
        int y=rand.nextInt(100,1000);
        CreditCard cc=new CreditCard(x,1000,y,date+5,pin,name);
        list.add(cc);
        System.out.println(cc.toString());
        System.out.println("Done! is there anything else I can help you with today?");
    }
    public static void savingAcc(ArrayList<DebitCard> list,int date)
    {
        System.out.println("And can you give me a 4 digit pin you want.");
        int pin=console.nextInt();
        System.out.println("And can you give me you full name.");
        String name=console.next();
        int x=rand.nextInt(100000000,1000000000);
        int y=rand.nextInt(100,1000);
        DebitCard sa=new SavingAcc(x,0,y,date+5,pin,name);
        list.add(sa);
        System.out.println(sa.toString());
        System.out.println("Done! is there anything else I can help you with today?");
    }
    public static void chechingAcc(ArrayList<DebitCard> list,int date)
    {
        System.out.println("And can you give me a 4 digit pin you want.");
        int pin=console.nextInt();
        System.out.println("And can you give me you full name.");
        String name=console.next();
        int x=rand.nextInt(100000000,1000000000);
        int y=rand.nextInt(100,1000);
        DebitCard ca=new ChechingAcc(x,0,y,date+5,pin,name);
        list.add(ca);
        System.out.println(ca.toString());
        System.out.println("Done! is there anything else I can help you with today?");
    }
    public static void balance(ArrayList<DebitCard> list,int date)
    {
        System.out.println("I can help you with that, can you give me your card number.");
        int cardNum=console.nextInt();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getIdNum()==cardNum){
                System.out.println("Great! can you give me your pin now.");
                int pin=console.nextInt();
                System.out.println("pin: "+pin);
                if(pin==list.get(i).getPin()){
                    System.out.println("Your balance is: "+list.get(i).getBalance());
                    System.out.println("Done! is there anything else I can help you with today?");
                }else{
                    System.out.println("I'm sorry but your pin is incorrect. Please try again.");
                    balance(list,date);
                }
            }
        }
    }
    public static void deposite(ArrayList<DebitCard> list,int date)
    {
        System.out.println("I can help you with that, can you give me your card number.");
        int cardNum=console.nextInt();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getIdNum()==cardNum){
                System.out.println("Great! can you give me your pin now.");
                int pin=console.nextInt();
                System.out.println("pin: "+pin);
                if(pin==list.get(i).getPin()){
                    System.out.println("And how much do you want to deposite.");
                    int deposite=console.nextInt();
                    list.get(i).deposite(deposite);
                    System.out.println("Your balance is: "+list.get(i).getBalance());
                    System.out.println("Done! is there anything else I can help you with today?");
                }else{
                    System.out.println("I'm sorry but your pin is incorrect. Please try again.");
                    deposite(list,date);
                }
            }
        }
    }
    public static void withdraw(ArrayList<DebitCard> list,int date)
    {
        System.out.println("I can help you with that, can you give me your card number.");
        int cardNum=console.nextInt();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getIdNum()==cardNum){
                System.out.println("Great! can you give me your pin now.");
                int pin=console.nextInt();
                System.out.println("pin: "+pin);
                if(pin==list.get(i).getPin()){
                    System.out.println("And how much do you want to withdraw.");
                    int withdraw=console.nextInt();
                    list.get(i).withdraw(withdraw);
                    System.out.println("Your balance is: "+list.get(i).getBalance());
                    System.out.println("Done! is there anything else I can help you with today?");
                }else{
                    System.out.println("I'm sorry but your pin is incorrect. Please try again.");
                    withdraw(list,date);
                }
            }
        }
    }
    public static void info(ArrayList<DebitCard> list,int date)
    {
        System.out.println("I can help you with that, can you give me your card number.");
        int cardNum=console.nextInt();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getIdNum()==cardNum){
                System.out.println("Great! can you give me your pin now.");
                int pin=console.nextInt();
                System.out.println("pin: "+pin);
                if(pin==list.get(i).getPin()){
                    System.out.println(list.get(i).toString());
                    System.out.println("Done! is there anything else I can help you with today?");
                }else{
                    System.out.println("I'm sorry but your pin is incorrect. Please try again.");
                    info(list,date);
                }
            }
        }
    }
    public static void transfer(ArrayList<DebitCard> list,int date)
    {
        System.out.println("I can help you with that, can you give me your card number.");
        int cardNum=console.nextInt();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getIdNum()==cardNum){
                System.out.println("Great! can you give me your pin now.");
                int pin=console.nextInt();
                System.out.println("pin: "+pin);
                if(pin==list.get(i).getPin()){
                    System.out.println("And can you give me the card number of the other card.");
                    int cardNum2=console.nextInt();
                    for(int j=0;j<list.size();j++){
                        if(list.get(j).getIdNum()==cardNum2){
                            System.out.println("Great! can you give me your pin now.");
                            int pin2=console.nextInt();
                            if(pin2==list.get(j).getPin()){
                                System.out.println("And how much do you want to transfer.");
                                int transfer=console.nextInt();
                                list.get(i).transfer(list.get(j),transfer);
                                System.out.println("Done! is there anything else I can help you with today?");
                            }
                        }
                    }
                }else{
                    System.out.println("I'm sorry but your pin is incorrect. Please try again.");
                    transfer(list,date);
                }
            }
        }
    }
    public static void sort(ArrayList<DebitCard> list)
    {
        
    }
    public static int search(ArrayList<DebitCard> list,int n)
    {
        if(list.size()==0){
            return 0;
        }else if(list.get(list.size()/2).getIdNum()==n){
            return list.size()/2;
        }
        return 0;
    }
    public static boolean end()
    {
        String answer=console.next();
        if(answer.equalsIgnoreCase("stop"))
        {
            return true;
        }else{
            return false;
        }
    }
    public static boolean subString(String sub, String string)
    {
        for (int i=0;i<=string.length()-sub.length();i++)
        {
            String s=string.substring(i,i+sub.length());
            if(s.equalsIgnoreCase(sub))
            {
                return true;
            }
        }
        return false;
    }
}