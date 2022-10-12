public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount+=sum;
    }

    public void withDraw(int sum) throws LimitException {

        if(sum > amount) {
            throw new LimitException("Не достаточно средств " + "У вас на счету осталось: ", amount);
        }else{
            System.out.println("У вас на счету " + amount);
            amount-=sum;
            System.out.println("Вы сняли со счета " + sum);
            System.out.println(getAmount());
        }

    }
}
