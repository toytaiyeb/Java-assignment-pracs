import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts=new ArrayList();

    public Bank(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAcc(Account x)
    {
        accounts.add(x);

    }
    public void closeAcc(Account x)
    {
        accounts.remove(x);
    }
   public void updateAcc(SavingAccount x)
   {
       x.addInterest(x.getInterest());


   }
    public Account updateAcc(CurrentAccount x)
    {

        double tempbal=x.getBalance();
        if (tempbal<0)
        {
            x.creditTaken=x.overDraft+tempbal;
        }
        if(tempbal+x.overDraft<=0){
            System.err.println("Your account has gone into overdraft you have :"+ x.creditTaken+" remaining");
        }

        return x;
    }
}
