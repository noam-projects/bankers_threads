
public class Account 
{
    public String account_number;
    public double balance;
    public Account(String account_number,double balance)
    {
        this.account_number=account_number;
        this.balance=balance;
    }
    public synchronized void transaction(double transaction_amount,String pakid_thread_name)
    {
        try
        {
        while((balance+transaction_amount)<0)
        {
            System.out.println("thread number "+pakid_thread_name+" thread waiting,current balance is "+balance+" transaction amount is "+transaction_amount);
            wait();
        }
        }
        catch(InterruptedException exception)
        {
            System.out.println("program interupted,failed to perform action");
            System.exit(0);
        }
        this.balance=this.balance+transaction_amount;
        notifyAll();
    }
    public synchronized double getBalance()
    {
        return this.balance;
    }
}
