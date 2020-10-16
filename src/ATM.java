public class ATM {
    private int count = 0;

    public int in(int amount){
        count = count + amount;
        return count;
    }
    public int out(int amount){
        if (amount>count){
            return 0;
        }
        count = count - amount;
        return count;
    }

}
