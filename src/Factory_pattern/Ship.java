package Factory_pattern;

public class Ship implements Transport{
    @Override
    public void deliver(){
        System.out.println("Delivery by Water");
    }
}
