public class Calculator implements Scical,Calc1 {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int multi(int a, int b) {
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }

    @Override
    public double sqrt(int a) {
        return a/a;
    }
}
