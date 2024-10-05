package Factory_pattern;

public class Drone implements Transport {
    @Override
    public void deliver(){
        System.out.println("Delivery by Air");
    }
}
