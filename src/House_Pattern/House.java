
package House_Pattern;
public class House {
    private int numRooms;
    private int numFloors;
    private boolean hasPool;
    private boolean hasGarage;

    private House(HouseBuilder builder) {
        this.numRooms = builder.numRooms;
        this.numFloors = builder.numFloors;
        this.hasPool = builder.hasPool;
        this.hasGarage = builder.hasGarage;
    }

    public static class HouseBuilder {
        private int numRooms;
        private int numFloors;
        private boolean hasPool;
        private boolean hasGarage;

        public HouseBuilder setRooms(int numRooms) {
            this.numRooms = numRooms;
            return this;
        }



        public HouseBuilder setFloors(int numFloors) {
            this.numFloors = numFloors;
            return this;
        }

        public HouseBuilder setPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }


        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }
    public String toString() {
        return "House with " + numRooms + " rooms, " + numFloors + " floors, Pool: " + (hasPool ? "yes" : "no") + ", Garage: " + (hasGarage ? "yes" : "no");
    }
}