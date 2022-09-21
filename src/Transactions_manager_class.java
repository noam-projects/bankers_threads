//this is the transactions database
import java.util.ArrayList;
public class Transactions_manager_class 
{
    public ArrayList<Transaction_Details> transactions_arraylist;
    public Transactions_manager_class(ArrayList<Transaction_Details> transactions)
    {
        this.transactions_arraylist=transactions;
    }
    public synchronized Transaction_Details assign_transaction()
    {
        if(this.transactions_arraylist.size()>=1)
        {
            Transaction_Details pakid_transaction=new Transaction_Details(this.transactions_arraylist.get(0).owner_number,this.transactions_arraylist.get(0).amount);
            this.transactions_arraylist.remove(0);
            return pakid_transaction;
        }
        else 
            return null;
    }
}
