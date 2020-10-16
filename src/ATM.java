public class ATM {
    private int count = 0;

    public int in(int amount){
        this.count = count + amount;
        return count;
    }
    public int out(int amount){
        if (amount>count){
            return count;
        }
        this.count = count - amount;
        return count;
    }

}
