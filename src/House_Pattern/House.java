package House_Pattern;
// This is the House class which represent a house with some properties
public class House {
    private int numRooms; // the number of rooms in the house
    private int numFloors; // the number of floors in the house
    private boolean hasPool; // if there is a pool in the house
    private boolean hasGarage; // if there is a garage in the house

    // Constructor for House which takes HouseBuilder object
    private House(HouseBuilder builder) {
        // Here we set values from the builder
        this.numRooms = builder.numRooms;
        this.numFloors = builder.numFloors;
        this.hasPool = builder.hasPool;
        this.hasGarage = builder.hasGarage;
    }

    // This is static inner class HouseBuilder for creating House objects
    public static class HouseBuilder {
        private int numRooms; // this is the number of rooms
        private int numFloors; // and number of floors
        private boolean hasPool; // and if there is a pool
        private boolean hasGarage; // and if there is a garage

        // Method to set number of rooms
        public HouseBuilder setRooms(int numRooms) {
            this.numRooms = numRooms; // we assign value here
            return this; // return the current object to chain methods
        }

        // Method to set number of floors
        public HouseBuilder setFloors(int numFloors) {
            this.numFloors = numFloors; // also assigning value
            return this; // return the object
        }

        // Method to set if house has pool
        public HouseBuilder setPool(boolean hasPool) {
            this.hasPool = hasPool; // assign value for pool
            return this; // return the object
        }

        // Method to set if house has garage
        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage; // similarly for garage
            return this; // return the object
        }

        // Method to build House object
        public House build() {
            return new House(this); // create new House using builder
        }
    }

    // Overriding toString method to display house info
    public String toString() {
        // Return a string with house information
        return "House with " + numRooms + " rooms, " + numFloors + " floors, Pool: " + (hasPool ? "yes" : "no") + ", Garage: " + (hasGarage ? "yes" : "no");
    }
}
