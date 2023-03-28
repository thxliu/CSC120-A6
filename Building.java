/**
 * public class that creates a generic Building
 */
public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    /**
     * Constructor to build a building
     * @param name Building name
     * @param address Building address
     * @param nFloors Number of floors in the building
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * accessor for the protected attribute name 
     * @return the name of the building as a string
     */
    public String getName() {
        return this.name;
    }

    /**
     * accessor for the protected attribute address
     * @return the address of the building as a string
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * accessor for the protected attribute nFloors
     * @return the number of floors in the building as an integer 
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Overrides the toString() method to give a formatted description of the building
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
