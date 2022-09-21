
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class pakid_in_bank extends Thread 
{
    private Transactions_manager_class acces_to_transactions_queue;
    private Accounts_manager_class accounts;
    public pakid_in_bank(Transactions_manager_class transactions,Accounts_manager_class accounts)
    {
        this.acces_to_transactions_queue=transactions;
        this.accounts=accounts;
    }
    public void run()
    {
        Transaction_Details performed_transaction=this.acces_to_transactions_queue.assign_transaction();
        while(performed_transaction!=null)
        {
        Account selected_account=null;
        for(int i=0;i<this.accounts.accounts_arraylist.size();i++)
        {
            if(performed_transaction.owner_number==this.accounts.accounts_arraylist.get(i).account_number)
                selected_account=this.accounts.accounts_arraylist.get(i);
        }
        System.out.println("current status before transaction");
        System.out.println("account_number"+selected_account.account_number+" "+selected_account.balance);
        selected_account.transaction(performed_transaction.amount,this.getName());
        System.out.println("current status after transaction");
        System.out.println("account_number"+selected_account.account_number+" "+selected_account.balance);
        int random_sleep_time=(int)Math.random()*100;
        try
        {
            TimeUnit.MILLISECONDS.sleep(random_sleep_time);
        }
        catch(InterruptedException exception)
        {
            System.out.println("thread interuped program failed");
            System.exit(0);
        }
        performed_transaction=this.acces_to_transactions_queue.assign_transaction();
        System.out.println("transactions queue size"+this.acces_to_transactions_queue.transactions_arraylist.size());
        }
        System.out.println(this.getId()+" ended succesfully!");
    }
}
