package House_Pattern;

public class MainHouse {
    public static void main(String[] args) {
        House house1 = new House.HouseBuilder()
                .setRooms(3)
                .setFloors(2)
                .setPool(true)
                .setGarage(false)
                .build();

        System.out.println(house1);
    }

}
