public class CurrentAccount extends Account {
     public double overDraft=100.00;
     public double creditTaken=0.0;
    public CurrentAccount(int a) {

        super(a);
    }

    public void withdraw(double sum)

    {
        double tempbal=getBalance();

        if (sum>0) {

            tempbal -= sum;
        }


         if(tempbal+overDraft<=0){

            System.err.println("Your account has gone into overdraft you had :"+overDraft+" limit please update the" +
                    " account in order to check how much remaining credit can u take");
        }
        setBal(tempbal);

    }





}
