public class SavingAccount extends Account{

    private double interest=.10;



    public void addInterest(double interest) {
        double sum=getBalance();
        sum=sum*interest+sum;
        setBal(sum);
    }

    public double getInterest() {
        return interest;
    }

    public SavingAccount(int a) {
        super(a);
    }

}
