public class Main {
    public static void main(String[] args) {
        BankAccount kanykei = new BankAccount();
        kanykei.deposit(20000);
        System.out.println(kanykei.getAmount());
        while (true){
            try {
               kanykei.withDraw(6000);
            } catch (LimitException e) {
                try {
                    kanykei.withDraw((int) kanykei.getAmount());
                } catch (LimitException exception) {
                    exception.printStackTrace();
                }
                break;
            }
        }
    }
}