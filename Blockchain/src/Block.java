import java.util.ArrayList;

public class Block {

    public static void main(String[] args) {

        ArrayList<Transaction> blockChain = new ArrayList<>();

        //first block
        String[] initialValues = {"Thato Mmadi pay R700"};
        Transaction firstBlock = new Transaction(initialValues,0);
        blockChain.add(firstBlock);
        System.out.println("first block : "+ firstBlock.toString());
        System.out.println("the block chain : "+ blockChain.toString());
        System.out.println();
        System.out.println();

        //second block
        String[] buying = {"Thato Mmadi pay R700"};
        Transaction secondBlock = new Transaction(buying, firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println("second block : "+ secondBlock.toString());
        System.out.println("the block chain : "+ blockChain.toString());
        System.out.println();
        System.out.println();


        //third block
        String[] change = {"Thato Mmadi pay R700"};
        Transaction thirdBlock = new Transaction(change, secondBlock.getBlockHash());
        blockChain.add(thirdBlock);
        System.out.println("third block : "+ thirdBlock.toString());
        System.out.println("the block chain : "+ blockChain.toString());

    }
}
