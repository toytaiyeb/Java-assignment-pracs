import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
       // I have taken overdraft as 100 and interest as .10 (both are constant)
        SavingAccount account1=new SavingAccount(21);
        



        CurrentAccount account2=new CurrentAccount(22);
        ArrayList<Account> accounts=new ArrayList();
        Bank bank1=new Bank(accounts);
        bank1.addAcc(account1);
        bank1.addAcc(account2);
        account1.setBal(140);
        account2.setBal(140);
        account2.withdraw(250);
        bank1.updateAcc(account1);
        bank1.updateAcc(account2);
        account1.print();





    }

}
