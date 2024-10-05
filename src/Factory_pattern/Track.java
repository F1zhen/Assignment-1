package Factory_pattern;

public class Track implements Transport {

    @Override
    public void deliver(){
        System.out.println("Delivery by Land");
    }

}
