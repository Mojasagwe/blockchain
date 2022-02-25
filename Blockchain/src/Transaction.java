import java.util.Arrays;

public class Transaction {
    private String [] transactions;
    private int blockHash;
    private int previousBlockHash;


public String toString(){
    return "block [transactions= "+Arrays.toString(transactions)+",block="+ blockHash
            +", previousBlockHash = "+ previousBlockHash+"]";
}


    public Transaction(String[] transactions,int previousBlockHash){
        super();
        this.transactions = transactions;
        this.previousBlockHash = previousBlockHash;
        this.blockHash = Arrays.hashCode(new int []{ Arrays.hashCode(transactions),this.previousBlockHash});
    }


    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }

    public void setPreviousBlockHash(int previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public int getPreviousBlockHash() {
        return previousBlockHash;
    }

}
