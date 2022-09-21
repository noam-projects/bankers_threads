
import java.util.ArrayList;
public class Banking_Operations 
{
    public static void main(String[] args)
    {
        System.out.println("unfortunatly i didnt have time to do the second question ");
        ArrayList<Account> accounts_array=new ArrayList<>();
        Account a=new Account("0",0);
        Account b=new Account("1",0);
        Account c=new Account("2",0);
        Account d=new Account("3",0);
        Account e=new Account("4",0);
        accounts_array.add(a);
        accounts_array.add(b);
        accounts_array.add(c);
        accounts_array.add(d);
        accounts_array.add(e);
        Accounts_manager_class accounts_list=new Accounts_manager_class(accounts_array);
        int random_arraylist_size=(int)(Math.random()*45+10);
        ArrayList<Transaction_Details> transactions_list_original=new ArrayList<>();
        for(int i=0;i<random_arraylist_size;i++)
        {
            int randomized_account=(int)(Math.random()*5);
            double random_double=Math.random()*2000-1000;
            if(randomized_account==0)
            {
                Transaction_Details added_transaction=new Transaction_Details("0",random_double);
                transactions_list_original.add(added_transaction);
            }
            if(randomized_account==1)
            {
                Transaction_Details added_transaction=new Transaction_Details("1",random_double);
                transactions_list_original.add(added_transaction);
            }
            if(randomized_account==2)
            {
                Transaction_Details added_transaction=new Transaction_Details("2",random_double);
                transactions_list_original.add(added_transaction);
            }
            if(randomized_account==3)
            {
                Transaction_Details added_transaction=new Transaction_Details("3",random_double);
                transactions_list_original.add(added_transaction);
            }
            if(randomized_account==4)
            {
                Transaction_Details added_transaction=new Transaction_Details("4",random_double);
                transactions_list_original.add(added_transaction);
            }
        }
        Transactions_manager_class transactions_list=new Transactions_manager_class(transactions_list_original);
        pakid_in_bank[] pkidim=new pakid_in_bank[10];
        for(int i=0;i<10;i++)
        {
            pkidim[i]=new pakid_in_bank(transactions_list,accounts_list);
        }
        for(int i=0;i<10;i++)
        {
            pkidim[i].start();
        }  
    }
}
